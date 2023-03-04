package com.project.Service;

import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Service;

import com.google.common.hash.Hashing;
import com.project.IService.IPasswordEncoderService;

@Service
public class PasswordEncoderService implements IPasswordEncoderService{

	public String encodePassword(String originalPassword)
	{
		String salt = "salt";
		String saltedOriginalPassword = salt + originalPassword;
		String encryptedPassword = Hashing.sha256()
								    .hashString(saltedOriginalPassword, StandardCharsets.UTF_8)
								    .toString();
		return encryptedPassword;
	}
}
