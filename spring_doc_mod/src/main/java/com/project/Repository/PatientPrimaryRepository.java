package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.PatientPrimary;

public interface PatientPrimaryRepository extends JpaRepository<PatientPrimary, Integer> {

	public PatientPrimary findByemail(String email);
}
