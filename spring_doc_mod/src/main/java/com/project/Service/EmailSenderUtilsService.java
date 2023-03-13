package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.IService.IEmailSenderUtilsService;
import com.project.exception.DataDoesntExistException;

public class EmailSenderUtilsService implements IEmailSenderUtilsService{
	
	@Autowired
	private EmailSenderService emailSenderService;
	
	@Autowired 
	private OtpService otpService;
	
	public void triggerMail(String email) throws DataDoesntExistException
	{
		int otp = 0;
		
			otp = otpService.generateOtp(email);
		
			// TODO Auto-generated catch block
			
		
		this.emailSenderService.sendSimpleEmail(email, "Your otp requestd by doctor is"+otp, "Welcome to Patient-management app");
	}
	
	

}
