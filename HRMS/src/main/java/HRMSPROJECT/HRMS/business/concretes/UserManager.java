package HRMSPROJECT.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import HRMSPROJECT.HRMS.business.abstracts.UserService;
import HRMSPROJECT.HRMS.dataAccess.abstracts.UserDao;
import HRMSPROJECT.HRMS.entities.concretes.Users;

public class UserManager implements UserService{

	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override 
	public List<Users> getAll() {
		
		return this.userDao.findAll();
	}

}
