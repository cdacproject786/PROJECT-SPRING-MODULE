package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.project.Service.FileUploadService;
import com.project.payload.FileResponse;

@RestController
public class ImageUploadController {

	@Value("${spring.servlet.multipart.location}")
	private String path;
	
	@Autowired
	private FileUploadService fileUploadService;
	
	
	@PostMapping("/upload")
	public ResponseEntity<FileResponse> fileUpload(@RequestParam("image") MultipartFile image)
	{
		try
		{
			System.out.println("Entered controller");
			String fileName = this.fileUploadService.uploadImage(path, image);
			RestTemplate templateForImage = new RestTemplate();
			String externalEndPoint = "http://localhost:3001/doctor/photo";
			String urlOfuploadedPhoto = templateForImage.postForObject(externalEndPoint, fileName, String.class);
			System.out.println(urlOfuploadedPhoto);
			return new ResponseEntity<>(new FileResponse(fileName, "Image uploaded successfully"),HttpStatus.OK);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(new FileResponse(null, "Internal Server Error"),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
		
		
	}
}
