package com.project.IService;

import org.springframework.stereotype.Service;

@Service
public interface IEmailSenderService {

	public void sendSimpleEmail(String toEmail,String body,String subject);
	
	public void sendEmailWithAttachment(String toEmail, String body, String subject,String attachment);
}
