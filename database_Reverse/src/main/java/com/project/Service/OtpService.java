package com.project.Service;

import org.springframework.stereotype.Service;

import com.project.jdbc.utils.generateOtpRepository;

@Service
public class OtpService {

	public int generateOtp()
	{
		generateOtpRepository.insertAutogenerateOtp();
		return generateOtpRepository.getOtp();
	}
}
