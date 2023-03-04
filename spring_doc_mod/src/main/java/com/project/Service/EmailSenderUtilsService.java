package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.IService.IEmailSenderUtilsService;

public class EmailSenderUtilsService implements IEmailSenderUtilsService{
	
	@Autowired
	private EmailSenderService emailSenderService;
	
	public void triggerMail(String email)
	{
		this.emailSenderService.sendSimpleEmail(email, "Body of email", "Welcome to Patient-management app");
	}

}
