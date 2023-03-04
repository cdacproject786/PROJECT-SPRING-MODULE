package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.IService.IDoctorMedRegistrationService;
import com.project.Repository.DoctorMedRegistrationRepository;
import com.project.entity.DoctorMedRegistration;
@Service
public class DoctorMedRegistrationService implements IDoctorMedRegistrationService {

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
