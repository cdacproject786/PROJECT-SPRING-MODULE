package com.project.IService;

import org.springframework.stereotype.Service;

@Service
public interface IUniqueKeyCheckService {

	public boolean checkDuplicateMedRegistration(Integer registrationId);
	
	public boolean checkDuplicateEmail(String email);
	
	public boolean checkDuplicateAdhaar(String adhaar);
	
	public boolean checkDuplicatePhone(String phone);
	
	public boolean checkDuplicatePanCard(String pan);
}
