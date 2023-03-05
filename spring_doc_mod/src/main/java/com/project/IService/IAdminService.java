package com.project.IService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.DoctorPrimary;
import com.project.entity.PatientPrimary;
import com.project.entity.proxy.DoctorPrimaryProxy;
import com.project.entity.proxy.PatientPrimaryProxy;
@Service
public interface IAdminService {

	public List<DoctorPrimary> getAllDoctor();
	
	public List<PatientPrimary> getAllPatient();
	

	
	public List<DoctorPrimary> getAllUnVerifiedDoctors();
	
	
}
