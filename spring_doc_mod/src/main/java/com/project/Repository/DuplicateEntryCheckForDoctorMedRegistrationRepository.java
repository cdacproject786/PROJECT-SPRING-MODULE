package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.DoctorMedRegistration;

public interface DuplicateEntryCheckForDoctorMedRegistrationRepository extends JpaRepository<DoctorMedRegistration, Integer> {

	public DoctorMedRegistration findBymedicalRegId(Integer Id);
}
