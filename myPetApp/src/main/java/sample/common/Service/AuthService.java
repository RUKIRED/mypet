package sample.common.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import sample.common.Repository.AuthRepository;
import sample.common.Repository.entity.UserEntity;

@Service
public class AuthService {
	private final AuthRepository authRepository;
	private final PasswordService passwordService;

	public AuthService(AuthRepository authRepository,
			PasswordService passwordService) {
		this.authRepository = authRepository;
		this.passwordService = passwordService;
	}

	public Optional<UserEntity> login(String username, String rawPassword) {
		return authRepository.findByUserName(username)
				.filter(user -> passwordService.matches(rawPassword, user.getPassword()));
	}

	public boolean existsByUsername(String username) {
		return authRepository.findByUserName(username).isPresent();
	}

	public UserEntity signUp(String username, String rawPassword) {
		if (existsByUsername(username)) {
			throw new IllegalArgumentException("このユーザー名は既に使われています。");
		}

		UserEntity user = new UserEntity();
		user.setUserName(username);
		user.setPassword(passwordService.encode(rawPassword));

		return authRepository.save(user);
	}
}