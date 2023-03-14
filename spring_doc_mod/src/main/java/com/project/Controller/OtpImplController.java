package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.EmailSenderService;
import com.project.Service.OtpService;
import com.project.entity.proxy.EmailProxy;
import com.project.entity.proxy.OtpValidationProxy;

@RestController
public class OtpImplController {
	@Autowired
	OtpService otpService;
	
	@Autowired
	EmailSenderService emailSenderService;

	@CrossOrigin("http://localhost:3000")
	@PostMapping("/doctor/forgotpassword")
	public ResponseEntity<String> generateOtp(@RequestBody EmailProxy emailProxy)
	{
		try
		{
			int generatedOtp =  this.otpService.generateOtp(emailProxy.getEmail());
			this.emailSenderService.sendSimpleEmail(emailProxy.getEmail(), "<h1>The otp is "+generatedOtp+" please do not share with anyone.</h1>", "med-history-management system-reset password");
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}

	}
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/doctor/validateotp")
	public ResponseEntity<OtpValidationProxy> validateOtp(@RequestBody OtpValidationProxy otp)
	{
		boolean isValiodated = this.otpService.validateOtpService(otp.getOtp());
		if(!isValiodated)
			return new ResponseEntity<OtpValidationProxy>(HttpStatus.UNAUTHORIZED);
		else
			return new ResponseEntity<OtpValidationProxy>(HttpStatus.OK);
	}
	
	
}
