package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.DoctorMedRegistrationService;
import com.project.entity.DoctorMedRegistration;

@RestController
public class DoctorMedRegistrationController {
	
	@Autowired
	private DoctorMedRegistrationService doctorMedRegistrationService;
	
	@PostMapping("/medregistration")
	public DoctorMedRegistration insertDoctorMed(@RequestBody DoctorMedRegistration registration)
	{
		return this.doctorMedRegistrationService.insertMedReg(registration);
	}
	
	@GetMapping("/medregistration")//tested
	public List<DoctorMedRegistration> getDoctorsRegistration()
	{
		return this.doctorMedRegistrationService.getAllDoctorRecords();
	}
}
