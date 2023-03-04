package com.project.IService;

import org.springframework.stereotype.Service;

@Service
public interface IPasswordEncoderService {

	public String encodePassword(String originalPassword);
}
