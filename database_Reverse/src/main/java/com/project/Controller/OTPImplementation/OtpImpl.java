package com.project.Controller.OTPImplementation;

import com.project.jdbc.utils.GenerateOtpRepository;


public class OtpImpl {
	
	
	public int getOtp()
	{
		GenerateOtpRepository repo = new GenerateOtpRepository();
		repo.insertAutogenerateOtp();
		int otp = repo.getOtp();
		return otp;
	}

}
