package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.DoctorEstablishment;

@Repository
public interface DoctorEstablishmentRepository extends JpaRepository<DoctorEstablishment, Integer> {

}
