package HRMSPROJECT.HRMS.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMSPROJECT.HRMS.business.abstracts.JobsService;
import HRMSPROJECT.HRMS.dataAccess.abstracts.JobsDao;
import HRMSPROJECT.HRMS.entities.concretes.Jobs;

@Service  
public class JobsManager implements JobsService {

	
	private JobsDao jobsDao;
	
	
	@Autowired
	public JobsManager(JobsDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}


	@Override 
	public List<Jobs> getAll() {
		
		return this.jobsDao.findAll();
	}

}
  