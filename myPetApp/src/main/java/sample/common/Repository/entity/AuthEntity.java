package sample.common.Repository.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users", schema = "public")
@Data
@NoArgsConstructor
public class AuthEntity {
	@Id
	@Column(name = "uuid")
	private UUID userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "password")
	private String password;
}