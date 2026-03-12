package sample.common.Repository.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pet", schema = "public")
@Data
@NoArgsConstructor
public class PetEntity {
	@Id
	@Column(name = "pet_id")
	private Long petId;
	@Column(name = "pet_name")
	private String petName;
	@Column(name = "uuid")
	private UUID userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "type")
	private String type;
	@Column(name = "intimacy")
	private int intimacy;
}