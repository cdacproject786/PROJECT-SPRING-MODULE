package com.project.Service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FileUpload {

	String uploadImage(String path, MultipartFile file) throws IOException;
}
