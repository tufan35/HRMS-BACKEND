package HRMSPROJECT.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = " verificationcodes ")
public class VerificationCode {
	
		@Id
		@Column(name = "id")
		private int id;
		@Column(name = "code")
		private String verificationCode;
		@Column(name = "isverified")
		private boolean isVerified;
		
		

}
