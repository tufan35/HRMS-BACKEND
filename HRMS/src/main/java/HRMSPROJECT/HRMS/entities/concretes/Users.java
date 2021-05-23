package HRMSPROJECT.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class Users {
	 
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "email_address")
	private String emailAddress;
	@Column(name = "password")
	private String password;

}
