package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.DuplicateEntryCheckForDoctorMedRegistrationRepository;
import com.project.Repository.DuplicateEntryCheckForDoctorPrimaryRepository;
import com.project.entity.DoctorMedRegistration;
import com.project.entity.DoctorPrimary;

@Service
public class UniqueKeyCheckService {
	
	@Autowired
	DuplicateEntryCheckForDoctorMedRegistrationRepository duplicateId;
	
	@Autowired
	DuplicateEntryCheckForDoctorPrimaryRepository duplicatePrimary;
	
	public boolean checkDuplicateMedRegistration(Integer registrationId)
	{
		DoctorMedRegistration foundMedId = this.duplicateId.findBymedicalRegId(registrationId);
		if(foundMedId == null)
			return false;
		else
			return true;
	}
	
	public boolean checkDuplicateEmail(String email)
	{
		DoctorPrimary primary = this.duplicatePrimary.findByemail(email);
		if(primary == null)
			return false;
		else
			return true;
	}
	
	public boolean checkDuplicateAdhaar(String adhaar)
	{
		DoctorPrimary primary = this.duplicatePrimary.findByadhaarCard(adhaar);
		if(primary == null)
			return false;
		else
			 return true;
	}
	
	public boolean checkDuplicatePhone(String phone)
	{
		DoctorPrimary primary = this.duplicatePrimary.findByphoneNumber(phone);
		if(primary == null)
			return false;
		else
			 return true;
	}
	
	public boolean checkDuplicatePanCard(String pan)
	{
		DoctorPrimary primary = this.duplicatePrimary.findBypanCard(pan);
		if(primary == null)
			return false;
		else
			return true;
	}

}
