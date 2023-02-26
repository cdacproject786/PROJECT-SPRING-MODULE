package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.DoctorMedRegistrationRepository;
import com.project.entity.DoctorMedRegistration;
@Service
public class DoctorMedRegistrationService {

	@Autowired
	private DoctorMedRegistrationRepository doctorMedRegistrationRepository;
	
	public DoctorMedRegistration insertMedReg(DoctorMedRegistration registration)
	{
		return this.doctorMedRegistrationRepository.save(registration);
	}
	
	public List<DoctorMedRegistration> getAllDoctorRecords()
	{
		return this.doctorMedRegistrationRepository.findAll();
	}
}
