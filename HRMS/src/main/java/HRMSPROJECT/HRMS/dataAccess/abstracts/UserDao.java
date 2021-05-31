package HRMSPROJECT.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSPROJECT.HRMS.entities.concretes.Users;

public interface UserDao extends JpaRepository<Users, Integer> {

}
