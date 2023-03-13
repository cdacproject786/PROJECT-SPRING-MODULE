package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.exception.DataDoesntExistException;

@Service
public interface IEmailSenderUtilsService {

	public void triggerMail(String email) throws DataDoesntExistException;
}
