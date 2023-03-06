package com.project.Service;

import java.io.File;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.entity.proxy.FilePathProxy;

@Service
public class CloudUploadService {
	
	public String uploadOnCloud(String filepath)
	{
		String externalEndpoint = "http://localhost:4000/doctor/photo";
		
		  HttpHeaders headers = new HttpHeaders();
		  headers.setContentType(MediaType.APPLICATION_JSON); 
		  HttpEntity<FilePathProxy> entity = new HttpEntity<FilePathProxy>(new FilePathProxy(filepath) ,headers); 
		  RestTemplate template = new RestTemplate();
		  System.out.println("Before hitting"); 
		  Object url = template.exchange(externalEndpoint, HttpMethod.POST,entity,Object.class);
		 
		/*
		 * HttpHeaders header = new HttpHeaders(); HttpEntity<FilePathProxy> request =
		 * new HttpEntity<>(new FilePathProxy(filepath));
		 * System.out.println("before hitting"); RestTemplate template = new
		 * RestTemplate();
		 */
		
		String uploadedUrl = (String)url;
		return uploadedUrl;
	}

}
