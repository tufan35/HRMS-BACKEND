package HRMSPROJECT.HRMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "candidates")
public class Candidate {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "identification_number")
	private String identificationNumber;
	@Column(name = "birthdate")
	private Date birthdate;
	
	

}
