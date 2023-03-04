package com.project.Service;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendSimpleEmail(String toEmail,String body,String subject)
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(toEmail);
		message.setSubject(subject);
		message.setText(body);
		message.setFrom("med_history_app@otlook.com");
		
		mailSender.send(message);
		
	}
	
	//This method is to send email with an attachment
	public void sendEmailWithAttachment(String toEmail, String body, String subject,String attachment)
	{
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		try {
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
		
		mimeMessageHelper.setFrom("arbaazsayed1602@gmail.com");
		mimeMessageHelper.setTo(toEmail);
		mimeMessageHelper.setText(body);
		mimeMessageHelper.setSubject(subject);
		
		FileSystemResource resource = new FileSystemResource(new File(attachment));
		
		mimeMessageHelper.addAttachment(resource.getFilename(), resource);
		
		mailSender.send(mimeMessage);
		System.out.println("Mail sent with attachment");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
