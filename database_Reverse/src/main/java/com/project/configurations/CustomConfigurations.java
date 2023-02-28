package com.project.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.project.Service.EmailSenderUtilsService;

@Configuration
public class CustomConfigurations {

	@Bean
	public EmailSenderUtilsService getEmailService()
	{
		return new EmailSenderUtilsService();
	}
}
