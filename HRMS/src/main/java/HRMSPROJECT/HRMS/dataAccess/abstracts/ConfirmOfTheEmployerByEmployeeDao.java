package HRMSPROJECT.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSPROJECT.HRMS.entities.concretes.ConfirmOfTheEmployerByEmployee;
import HRMSPROJECT.HRMS.entities.concretes.Employer;

public interface ConfirmOfTheEmployerByEmployeeDao extends JpaRepository<ConfirmOfTheEmployerByEmployee, Integer> {
	
	boolean existById(Employer employer);

	//ConfirmOfTheEmployerByEmployeeDao BURADAN DEVAM ET		https://github.com/sedayilmz/HRMS.Java/blob/master/hrms/src/main/java/kodlamaio/hrms/dataAccess/abstracts/EmployeeDao.java
	
}
