package sample.common.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sample.common.Repository.entity.PetEntity;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Long> {
	Optional<PetEntity> findBypetName(String petName);
}
