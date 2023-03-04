package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.entity.Address;
import com.project.entity.DoctorAvailMaster;
import com.project.entity.DoctorEstablishment;
import com.project.entity.DoctorMedRegistration;
import com.project.entity.DoctorPrimary;
import com.project.entity.SecurityQuestions;
import com.project.entity.proxy.DoctorPrimaryRegistrationProxy;
@Service
public interface IObjectCreationService {

	public Address createAddress(DoctorPrimaryRegistrationProxy proxy);
	
	public DoctorAvailMaster createDoctorAvail(DoctorPrimaryRegistrationProxy proxy);
	
	public DoctorEstablishment createEstablishment(DoctorPrimaryRegistrationProxy proxy);
	
	public DoctorMedRegistration createMedRegistration(DoctorPrimaryRegistrationProxy proxy);
	
	public SecurityQuestions createSecurityQuestion(DoctorPrimaryRegistrationProxy proxy);
	
	public DoctorPrimary createDoctorPrimary(DoctorAvailMaster insertAvailability,int insertAddressId,DoctorEstablishment insertEstablishment,DoctorMedRegistration insertDoctorMed,int questionId,DoctorPrimaryRegistrationProxy proxy);
}
