package sample.common.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.common.Repository.entity.PetEntity;

public interface PetRepository extends JpaRepository<PetEntity, Long> {
	Optional<PetEntity> findBypetName(String petName);
}
