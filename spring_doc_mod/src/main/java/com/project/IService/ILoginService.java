package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.entity.proxy.LoginProxy;
@Service
public interface ILoginService {

	public boolean ValidateDoctorLogin(LoginProxy proxy);
}
