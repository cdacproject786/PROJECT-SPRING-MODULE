package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.EmailSenderUtilsService;

@RestController
public class MailSenderController {

	@Autowired
	private EmailSenderUtilsService emailSenderUtilsService;
	
	@PostMapping("/email/{email}")
	public void sendEmail(@PathVariable String email)
	{
		this.emailSenderUtilsService.triggerMail(email);
	}
}
