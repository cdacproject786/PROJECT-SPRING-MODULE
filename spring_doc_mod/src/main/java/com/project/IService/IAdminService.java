package com.project.IService;

import java.util.List;

import com.project.entity.DoctorPrimary;
import com.project.entity.PatientPrimary;
import com.project.entity.proxy.DoctorPrimaryProxy;
import com.project.entity.proxy.PatientPrimaryProxy;

public interface IAdminService {

	public List<DoctorPrimary> getAllDoctor();
	
	public DoctorPrimaryProxy getOneDoctor(int doctorId);
	
	public List<PatientPrimary> getAllPatient();
	
	public void updateDoctor(DoctorPrimary doctorPrimary);
	
	public PatientPrimaryProxy getOnePatient(int uid);
}
