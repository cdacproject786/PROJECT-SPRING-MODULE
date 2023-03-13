package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.entity.AdminPrimary;
import com.project.entity.DoctorPrimary;
import com.project.entity.proxy.LoginProxy;
@Service
public interface ILoginService {

	public DoctorPrimary ValidateDoctorLogin(LoginProxy proxy);

	public boolean ValidateAdmin(AdminPrimary adminPrimary);
	
}
