package com.project.IService;

import org.springframework.stereotype.Service;

@Service
public interface IOtpService {

	public int generateOtp();
	
	public boolean validateOtpService(int otp);
}
