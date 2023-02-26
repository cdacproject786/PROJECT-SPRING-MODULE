package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.DoctorPrimary;

public interface DuplicateEntryCheckForDoctorPrimaryRepository extends JpaRepository<DoctorPrimary, Integer> {

	public DoctorPrimary findByemail(String email);
	
	public DoctorPrimary findByphoneNumber(String phoneNo);
	
	public DoctorPrimary findBypanCard(String panNo);
	
	public DoctorPrimary findByadhaarCard(String adhaar);
}
