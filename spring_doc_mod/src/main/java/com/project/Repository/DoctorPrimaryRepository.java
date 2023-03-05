package com.project.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.entity.Address;
import com.project.entity.DoctorPrimary;
@Repository
public interface DoctorPrimaryRepository extends JpaRepository<DoctorPrimary, Integer> {
	


	public DoctorPrimary findByemail(String email);

	public List<DoctorPrimary> findByprofileStatus(char status); 
	
	 

}

