package sample.common.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sample.common.Repository.entity.UserEntity;

@Repository
public interface AuthRepository extends JpaRepository<UserEntity, UUID> {
	Optional<UserEntity> findByUserName(String userName);
}
