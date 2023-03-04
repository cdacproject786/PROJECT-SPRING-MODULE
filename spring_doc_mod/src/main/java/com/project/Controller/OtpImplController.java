package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@PostMapping("/forgotpassword")
	public void generateOtp(@RequestBody EmailProxy emailProxy)
	{
		int generatedOtp =  this.otpService.generateOtp();
		this.emailSenderService.sendSimpleEmail(emailProxy.getEmail(), "<h1>The otp is "+generatedOtp+" please do not share with anyone.</h1>", "med-history-management system-reset password");
	}
	
	@PostMapping("/validateotp")
	public ResponseEntity<OtpValidationProxy> validateOtp(@RequestBody OtpValidationProxy otp)
	{
		boolean isValiodated = this.otpService.validateOtpService(otp.getOtp());
		if(!isValiodated)
			return new ResponseEntity<OtpValidationProxy>(HttpStatus.UNAUTHORIZED);
		else
			return new ResponseEntity<OtpValidationProxy>(HttpStatus.OK);
	}
}
