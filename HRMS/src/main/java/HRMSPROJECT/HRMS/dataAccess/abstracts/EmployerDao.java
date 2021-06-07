package HRMSPROJECT.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import HRMSPROJECT.HRMS.entities.concretes.Employer;


public interface EmployerDao extends JpaRepository<Employer, Integer>{

}


