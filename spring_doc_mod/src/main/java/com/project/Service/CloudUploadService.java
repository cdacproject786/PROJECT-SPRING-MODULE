package com.project.Service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CloudUploadService {
	
	public String uploadOnCloud(String filepath)
	{
		String externalEndpoint = "http://localhost:4000/doctor/photo";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity entity = new HttpEntity(filepath,headers);
		RestTemplate template = new RestTemplate();
		System.out.println("Before hitting");
		Object url = template.exchange(externalEndpoint, HttpMethod.POST,entity,Object.class);
		System.out.println("After hitting");
		String uploadedUrl = (String)url;
		return uploadedUrl;
	}

}
