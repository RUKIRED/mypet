package sample.common.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.common.Repository.entity.AuthEntity;

public interface AuthRepository extends JpaRepository<AuthEntity, UUID> {
	Optional<AuthEntity> findByUserNama(String userName);
}
