package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.EmailSenderUtilsService;
import com.project.Service.OtpService;
import com.project.exception.DataDoesntExistException;

@RestController
public class PatientMailSenderController {

	@Autowired
	private EmailSenderUtilsService emailSenderUtilsService;
	
	@Autowired
	private OtpService otpService;
	
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/patient/{email}")
	public ResponseEntity<?> sendEmail(@PathVariable String email)
	{
		try {
			System.out.println("Inside controller before call");
			this.emailSenderUtilsService.triggerMail(email);
			System.out.println("Inside controller after call");
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (DataDoesntExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	@CrossOrigin("http://localhost:3000")
	@PostMapping("/doctor/validatepatient/{otp}")
	public ResponseEntity<?> validateOtp(@PathVariable int otp)
	{
		boolean isValid = this.otpService.validateOtpService(otp);
		if(isValid)
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	}
}
