package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.DoctorPrimaryRepository;
import com.project.entity.DoctorPrimary;
import com.project.entity.proxy.LoginProxy;

@Service
public class LoginService {
	
	@Autowired
	private DoctorPrimaryRepository doctorPrimaryRepository;
	
	@Autowired
	private PasswordEncoderServie passwordEncoderServie;
	
	public boolean ValidateDoctorLogin(LoginProxy proxy)
	{
		DoctorPrimary primary = this.doctorPrimaryRepository.findByemail(proxy.getEmail());
		if(primary!= null)
		{
			if(primary.getPwd().equals(this.passwordEncoderServie.encodePassword(proxy.getPwd())))
			return true;
			else
			return false;
		}
		else
		return false;
		
	}

}
