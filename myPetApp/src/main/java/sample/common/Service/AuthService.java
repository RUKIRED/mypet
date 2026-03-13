package sample.common.Service;

import org.springframework.stereotype.Service;

import sample.common.Repository.AuthRepository;
import sample.common.Repository.entity.AuthEntity;

@Service
public class AuthService {
	private final AuthRepository authRepository;
	private final PasswordService passwordService;

	public AuthService(AuthRepository authRepository,
			PasswordService passwordService) {
		this.authRepository = authRepository;
		this.passwordService = passwordService;
	}
	
	public 
}