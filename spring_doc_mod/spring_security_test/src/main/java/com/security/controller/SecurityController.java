package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	@GetMapping("/")
	public String securityController()
	{
		return "<h1>Hello</h1>";
	}

}
