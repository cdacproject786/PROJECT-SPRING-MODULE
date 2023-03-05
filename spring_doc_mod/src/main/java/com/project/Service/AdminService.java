package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.IService.IAdminService;
import com.project.Repository.DoctorPrimaryRepository;
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
	
	public List<DoctorPrimary> getAllDoctor(){
		
		List<DoctorPrimary> doctorRetrived=this.doctorPrimaryRepository.findAll();
		return doctorRetrived;
	}
	public DoctorPrimaryProxy getOneDoctor(int doctorId){
		
		DoctorPrimary doctorRetrived=this.doctorPrimaryRepository.getById(doctorId);
		DoctorPrimaryProxy proxy=new DoctorPrimaryProxy();
		proxy.setDoctorId(doctorRetrived.getDoctorId());
		proxy.setAddress(doctorRetrived.getDoctorId());
		proxy.setAdhaarCard(doctorRetrived.getAdhaarCard());
		//proxy.setDoctorAvailMaster(doctorRetrived.getDoctorAvailMaster());
		proxy.setDoctorEstablishment(doctorRetrived.getDoctorEstablishment());
		proxy.setDoctorMedRegistration(doctorRetrived.getDoctorMedRegistration());
		proxy.setEmail(doctorRetrived.getEmail());
		proxy.setFname(doctorRetrived.getFname());
		proxy.setGender(doctorRetrived.getGender());
		proxy.setLname(doctorRetrived.getLname());
		proxy.setPanCard(doctorRetrived.getPanCard());
		proxy.setPhoneNumber(doctorRetrived.getPhoneNumber());
		proxy.setProfilePhoto(doctorRetrived.getProfilePhoto());
		proxy.setProfileStatus(doctorRetrived.getProfileStatus());
		proxy.setSpecialization(doctorRetrived.getSpecialization());
		proxy.setYearOfExperience(doctorRetrived.getYearOfExperience());
	
		return proxy;
	}
	
	public void updateDoctor(DoctorPrimary doctorPrimary) {
		int doctorId=doctorPrimary.getDoctorId();
		char profileStatus=doctorPrimary.getProfileStatus();
		this.doctorPrimaryRepository.updateDoctorPrimary(profileStatus,doctorId);
	}
	
	public List<PatientPrimary> getAllPatient(){
		
		List<PatientPrimary> patientsRetrived=this.patientPrimaryRepository.findAll();
		return patientsRetrived;
	}
	public PatientPrimaryProxy getOnePatient(int uid){
		
		PatientPrimary patientRetrived=this.patientPrimaryRepository.getById(uid);
		PatientPrimaryProxy proxy=new PatientPrimaryProxy();
		proxy.setUid(patientRetrived.getUid());
		proxy.setAddress(patientRetrived.getAddress());
		proxy.setAdhaarCard(patientRetrived.getAdhaarCard());
		proxy.setDateOfBirth(patientRetrived.getDateOfBirth());
		proxy.setEmail(patientRetrived.getEmail());
		proxy.setFname(patientRetrived.getFname());
		proxy.setGender(patientRetrived.getGender());
		proxy.setLname(patientRetrived.getLname());
		proxy.setMaritalStatus(patientRetrived.getMaritalStatus());
		proxy.setOccupation(patientRetrived.getOccupation());
		proxy.setPhone(patientRetrived.getPhone());
		proxy.setProfilePhoto(patientRetrived.getProfilePhoto());
	
		return proxy;
	}
}
