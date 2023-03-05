package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.IService.IAdminService;
import com.project.Repository.DoctorPrimaryRepository;
import com.project.Repository.DoctorPrimaryUpdateRepository;
import com.project.Repository.PatientPrimaryRepository;
import com.project.entity.DoctorPrimary;
import com.project.entity.PatientPrimary;
import com.project.entity.proxy.DoctorPrimaryProxy;
import com.project.entity.proxy.PatientPrimaryProxy;

@Service
public class AdminService implements IAdminService {

	@Autowired
	private DoctorPrimaryRepository doctorPrimaryRepository;
	
	@Autowired
	private PatientPrimaryRepository patientPrimaryRepository;
	
	@Autowired
	private DoctorPrimaryUpdateRepository doctorPrimaryUpdateRepository;
	
	public List<DoctorPrimary> getAllDoctor(){
		
		return this.doctorPrimaryRepository.findAll();
		
	}
	
	
	
	  public void updateDoctor(DoctorPrimary doctorPrimary)
	  {
		int doctorId = doctorPrimary.getDoctorId();
		this.doctorPrimaryUpdateRepository.UpdateDoctor(doctorId);
	  }
	 
	
	public List<PatientPrimary> getAllPatient(){
		
		List<PatientPrimary> patientsRetrived=this.patientPrimaryRepository.findAll();
		return patientsRetrived;
	}


	@Override
	public List<DoctorPrimary> getAllUnVerifiedDoctors() {
		return this.doctorPrimaryRepository.findByprofileStatus('U');
		
	}
	
}
