package HRMSPROJECT.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employees")
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id" )


public class Employee {

	@Column(name = "firtsname")
	private String firstName;
	@Column(name = "lastsname")
	private String lastName;
	
	
}
