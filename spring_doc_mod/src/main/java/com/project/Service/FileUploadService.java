package com.project.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService implements FileUpload {

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		
		//file name
		String name = file.getOriginalFilename();
		
		
		//Full Path
		String randomId = UUID.randomUUID().toString();
	    String fileName1 = 	randomId.concat(name.substring(name.lastIndexOf(".")));
	    
		String filePath = path + File.separator+fileName1;
		
		
		//create folder if not created
		File f = new File(path);
		if(!f.exists())
		{
			f.mkdir();
		}
		//copy file
		
		Files.copy(file.getInputStream(), Paths.get(filePath));
		
	
		return name;
	}

	
	
}
