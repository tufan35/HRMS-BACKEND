package HRMSPROJECT.HRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMSPROJECT.HRMS.business.abstracts.UserService;
import HRMSPROJECT.HRMS.entities.concretes.Users;

@RestController
@RequestMapping("/api/users" )
public class UserController {

	
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@GetMapping("/getall")
	public List<Users> getAll(){
		
		return this.userService.getAll();
	}
	
}
