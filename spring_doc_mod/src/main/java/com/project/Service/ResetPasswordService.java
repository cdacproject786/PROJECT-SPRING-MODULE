package com.project.Service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.proxy.ResetPasswordProxy;
import com.project.jdbc.utils.ResetPasswordRepository;

@Service
public class ResetPasswordService {
	
	@Autowired
	PasswordEncoderService passwordEncoderService;

	public void changePassword(ResetPasswordProxy proxy) throws SQLException
	{
		String encodedPassword = this.passwordEncoderService.encodePassword(proxy.getPwd());
		ResetPasswordRepository.changePassword(proxy.getEmail(), encodedPassword);
	}
}
