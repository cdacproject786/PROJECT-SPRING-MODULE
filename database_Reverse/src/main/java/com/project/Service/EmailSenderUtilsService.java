package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderUtilsService {
	
	@Autowired
	private EmailSenderService emailSenderService;
	
	public void triggerMail(String email)
	{
		this.emailSenderService.sendSimpleEmail(email, "Body of email", "Welcome to Patient-management app");
	}

}
