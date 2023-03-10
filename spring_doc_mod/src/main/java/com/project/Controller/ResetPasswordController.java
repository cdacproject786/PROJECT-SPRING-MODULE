package com.project.Controller;

import java.net.ConnectException;
import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.ResetPasswordService;
import com.project.entity.proxy.ResetPasswordProxy;


@RestController
public class ResetPasswordController {
	
	@Autowired
	private ResetPasswordService restPasswordService;
	
	@PostMapping("/doctor/resetpassword")
	public ResponseEntity<String> resetPassword(@RequestBody ResetPasswordProxy proxy)
	{
		try
		{
			this.restPasswordService.changePassword(proxy);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
