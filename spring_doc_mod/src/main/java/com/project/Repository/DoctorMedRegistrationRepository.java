package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.DoctorMedRegistration;

@Repository
public interface DoctorMedRegistrationRepository extends JpaRepository<DoctorMedRegistration, Integer> {

}
