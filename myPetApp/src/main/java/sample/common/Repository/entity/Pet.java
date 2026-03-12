package sample.common.Repository.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Pet {
	private Long petId;
	private String petNameString;
	private UUID userId;
}
