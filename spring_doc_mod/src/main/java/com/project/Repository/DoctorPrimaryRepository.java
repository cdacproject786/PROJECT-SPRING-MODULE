package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.entity.DoctorPrimary;

@Repository
public interface DoctorPrimaryRepository extends JpaRepository<DoctorPrimary, Integer> {

	public DoctorPrimary findByemail(String email);
	
	@Modifying
	@Query("UPDATE Doctor_Primary doctor SET doctor.Profile_Status =?1 WHERE doctor.doctor_Id =?2")
	void updateDoctorPrimary(char profileStatus,int doctorId);
		
}

