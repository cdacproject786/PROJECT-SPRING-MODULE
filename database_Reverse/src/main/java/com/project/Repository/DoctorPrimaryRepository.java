package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.DoctorPrimary;

public interface DoctorPrimaryRepository extends JpaRepository<DoctorPrimary, Integer> {

	public DoctorPrimary findByemail(String email);
}
