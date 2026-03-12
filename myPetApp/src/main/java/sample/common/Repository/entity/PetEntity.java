package sample.common.Repository.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PetEntity {
	@Id
	private Long petId;
	private String petName;
	private UUID userId;
	private String userName;
	private String gender;
	private String type;
	private int intimacy;
}