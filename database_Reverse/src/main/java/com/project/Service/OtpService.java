package com.project.Service;

import org.springframework.stereotype.Service;

import com.project.jdbc.utils.GenerateOtpRepository;
import com.project.jdbc.utils.ValidateOtpRepository;

@Service
public class OtpService {

	public int generateOtp()
	{
		GenerateOtpRepository.insertAutogenerateOtp();
		return GenerateOtpRepository.getOtp();
	}
	
	public boolean validateOtpService(int otp)
	{
		int otpInDb = ValidateOtpRepository.validateOtp();
		
		if(otp == otpInDb)
		return true;
		else
		return false;
	}
}
