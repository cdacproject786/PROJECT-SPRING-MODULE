package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.IService.IObjectCreationService;
import com.project.entity.Address;
import com.project.entity.DoctorAvailMaster;
import com.project.entity.DoctorEstablishment;
import com.project.entity.DoctorMedRegistration;
import com.project.entity.DoctorPrimary;
import com.project.entity.SecurityQuestions;
import com.project.entity.proxy.DoctorPrimaryRegistrationProxy;
@Service
public class ObjectCreationService implements IObjectCreationService {
	@Autowired
	private PasswordEncoderService passwordEncoderService;
	
	
	

	
	public Address createAddress(DoctorPrimaryRegistrationProxy proxy)
	{
		Address address = new Address();
		address.setAddressLine1(proxy.getAddressLine1());
		address.setCity(proxy.getCity());
		address.setCountry(proxy.getCountry());
		address.setPinCode(proxy.getPinCode());
		address.setUserState(proxy.getUserState());
		return address;
	}
	
	public DoctorAvailMaster createDoctorAvail(DoctorPrimaryRegistrationProxy proxy)
	{
		DoctorAvailMaster master = new DoctorAvailMaster();
		master.setDoctorAvailDay(proxy.getDoctorAvailDay());
		master.setDoctorAvailTime(proxy.getDoctorAvailTime());
		master.setFees(proxy.getFees());
		return master;
	}

	public DoctorEstablishment createEstablishment(DoctorPrimaryRegistrationProxy proxy)
	{
		    DoctorEstablishment establishment = new DoctorEstablishment();
			establishment.setEstablishment(proxy.getEstablishment());
			establishment.setEstablishmentCity(proxy.getEstablishmentCity());
			establishment.setEstablishmentLocation(proxy.getEstablishmentLocation());
			establishment.setEstablishmentName(proxy.getEstablishmentName());
			establishment.setEstablishmentPin(proxy.getPinCode());
			establishment.setEstablishmentProof(proxy.getEstablishmentProof());
			return establishment;
	}
	
	public DoctorMedRegistration createMedRegistration(DoctorPrimaryRegistrationProxy proxy)
	{
		DoctorMedRegistration registration = new DoctorMedRegistration();
		registration.setCollege(proxy.getCollege());
		registration.setDegree(proxy.getDegree());
		registration.setMedicalRegId(proxy.getMedicalRegId());
		registration.setRegistrationCouncil(proxy.getRegistrationCouncil());
		registration.setRegistrationYear(proxy.getRegistrationYear());
		registration.setYearOfCompletion(proxy.getYearOfCompletion());
		return registration;
	}
	
	public SecurityQuestions createSecurityQuestion(DoctorPrimaryRegistrationProxy proxy)
	{
		SecurityQuestions questions = new SecurityQuestions();
		questions.setSecurityQuestion(proxy.getSecurityQuestion());
		return questions;
	}
	
	public DoctorPrimary createDoctorPrimary(DoctorAvailMaster insertAvailability,int insertAddressId,DoctorEstablishment insertEstablishment,DoctorMedRegistration insertDoctorMed,int questionId,DoctorPrimaryRegistrationProxy proxy)
	{
		DoctorPrimary docPrimary = new DoctorPrimary();
		docPrimary.setDoctorId(insertAvailability.getDoctorId());
		docPrimary.setAddress(insertAddressId);
		docPrimary.setDoctorEstablishment(insertEstablishment.getEid());
		docPrimary.setDoctorMedRegistration(insertDoctorMed.getMedicalRegId());
		//docPrimary.setDoctorAvailMaster(insertAvailability.getDoctorId());
		docPrimary.setSecurityQuestions(questionId);
		docPrimary.setDoctorId(insertAvailability.getDoctorId());
		docPrimary.setAdhaarCard(proxy.getAdhaarCard());
		docPrimary.setEmail(proxy.getEmail());
		docPrimary.setFname(proxy.getFname());
		docPrimary.setGender(proxy.getGender());
		docPrimary.setLname(proxy.getLname());
		docPrimary.setPanCard(proxy.getPanCard());
		docPrimary.setPhoneNumber(proxy.getPhoneNumber());
		docPrimary.setProfileStatus('U');
		
		//encrypting the password before setting it to the doctor object
		String encryptedPassword = this.passwordEncoderService.encodePassword(proxy.getPwd());
	
		docPrimary.setPwd(encryptedPassword); //the hashed password is set at this line
		docPrimary.setSecurityQuestionsAnswer(proxy.getSecurityQuestionsAnswer());
		docPrimary.setSpecialization(proxy.getSpecialization());
		docPrimary.setYearOfExperience(proxy.getYearOfExperience());
		
		
		
		return docPrimary;
	}
}
