package com.project.IService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.DoctorMedRegistration;
@Service
public interface IDoctorMedRegistrationService {

	public DoctorMedRegistration insertMedReg(DoctorMedRegistration registration);
	
	public List<DoctorMedRegistration> getAllDoctorRecords();
}
