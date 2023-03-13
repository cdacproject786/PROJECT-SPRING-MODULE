package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.IService.ILoginService;
import com.project.Repository.AdminPrimaryRepository;
import com.project.Repository.DoctorPrimaryRepository;
import com.project.entity.AdminPrimary;
import com.project.entity.DoctorPrimary;
import com.project.entity.proxy.LoginProxy;

@Service
public class LoginService implements ILoginService {
	
	@Autowired
	private DoctorPrimaryRepository doctorPrimaryRepository;
	
	@Autowired
	private AdminPrimaryRepository adminPrimaryRepository;
	
	@Autowired
	private PasswordEncoderService passwordEncoderServie;
	
	public DoctorPrimary ValidateDoctorLogin(LoginProxy proxy)
	{
		DoctorPrimary primary = this.doctorPrimaryRepository.findByemail(proxy.getEmail());
		if(primary!= null)
		{
			if(primary.getPwd().equals(this.passwordEncoderServie.encodePassword(proxy.getPwd())))
			return primary;
			else
			return null;
		}
		else
		return null;
		
	}

	public boolean ValidateAdmin(AdminPrimary adminPrimary)
	{
		AdminPrimary primary = this.adminPrimaryRepository.findByEmailAndPwd(adminPrimary.getEmail(), passwordEncoderServie.encodePassword(adminPrimary.getPwd()));
		if(primary == null)
			return false;
		else return true;
	}
}
