package com.project.IService;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface IFileUploadServices {

	String uploadImage(String path, MultipartFile file) throws IOException;
}
