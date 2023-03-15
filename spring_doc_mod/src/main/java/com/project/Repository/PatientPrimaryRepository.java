package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.entity.PatientPrimary;

public interface PatientPrimaryRepository extends JpaRepository<PatientPrimary, Integer> {

	@Query(value = "select email from patient_primary where email = ?1",nativeQuery = true)
	public String Checkemail(String email);
	
	
	public PatientPrimary findByemail(String email);
}
