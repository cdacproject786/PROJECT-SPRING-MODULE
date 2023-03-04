package com.project.IService;

import org.springframework.stereotype.Service;

@Service
public interface IEmailSenderUtilsService {

	public void triggerMail(String email);
}
