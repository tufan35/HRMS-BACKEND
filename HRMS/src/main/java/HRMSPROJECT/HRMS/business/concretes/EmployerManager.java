package HRMSPROJECT.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import HRMSPROJECT.HRMS.business.abstracts.EmployerService;
import HRMSPROJECT.HRMS.dataAccess.abstracts.EmployerDao;
import HRMSPROJECT.HRMS.entities.concretes.Employer;

public class EmployerManager implements EmployerService {

	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}


	@Override
	public List<Employer> getAll() {
		
		return this.employerDao.findAll() ;
	}

}
