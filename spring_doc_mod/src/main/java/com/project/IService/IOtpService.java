package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.exception.DataDoesntExistException;

@Service
public interface IOtpService {

	public int generateOtp(String email) throws DataDoesntExistException;
	
	public boolean validateOtpService(int otp);
}
