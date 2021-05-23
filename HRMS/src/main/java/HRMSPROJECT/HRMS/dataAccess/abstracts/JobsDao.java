package HRMSPROJECT.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMSPROJECT.HRMS.entities.concretes.Jobs;

public interface JobsDao extends JpaRepository<Jobs, Integer> {

}
