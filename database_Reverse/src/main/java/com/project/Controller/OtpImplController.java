package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.OtpService;

@RestController
public class OtpImplController {
	@Autowired
	OtpService otpService;

	@GetMapping("/forgotpassword")
	public int generateOtp()
	{
		return this.otpService.generateOtp();
	}
}