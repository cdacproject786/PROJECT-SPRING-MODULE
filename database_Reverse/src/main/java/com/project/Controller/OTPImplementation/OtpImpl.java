package com.project.Controller.OTPImplementation;

import com.project.jdbc.utils.generateOtpRepository;

public class OtpImpl {
	
	
	public int getOtp()
	{
		generateOtpRepository repo = new generateOtpRepository();
		repo.insertAutogenerateOtp();
		int otp = repo.getOtp();
		return otp;
	}

}
