package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.project.Service.AdminService;
import com.project.Service.LoginService;
import com.project.entity.AdminPrimary;
import com.project.entity.DoctorPrimary;
import com.project.entity.PatientPrimary;
import com.project.entity.proxy.DoctorPrimaryProxy;
import com.project.entity.proxy.PatientPrimaryProxy;


@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private LoginService loginService;
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/admin/doctor")
	public ResponseEntity<List<DoctorPrimary>> getAllDoctors()
	{
		try {
		List<DoctorPrimary> doctorPrimaries =  this.adminService.getAllDoctor();
		return new ResponseEntity<List<DoctorPrimary>>(doctorPrimaries, HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(null,HttpStatus.OK);
		}
		}
	

	@CrossOrigin("http://localhost:3000")
	@PostMapping("/admin/doctors")
	public ResponseEntity updateDoctor(@RequestBody DoctorPrimary doctorPrimary)
	{
		 this.adminService.updateDoctor(doctorPrimary);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/admin/patient")
	public ResponseEntity<List<PatientPrimary>> getAllPatient()
	{
		
		try {
		List<PatientPrimary> patientPrimary =  this.adminService.getAllPatient();
		return new ResponseEntity<List<PatientPrimary>>(patientPrimary, HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(null, HttpStatus.OK);
		}
	}
	
	@CrossOrigin("http://localhost:3000")
    @GetMapping("/admin/doctors")
    public ResponseEntity<List<DoctorPrimary>> getUnverifiedDoctors()
    {
    	try
    	{
    		List<DoctorPrimary> allUnVerifiedDoctors = this.adminService.getAllUnVerifiedDoctors();
        	return new ResponseEntity<List<DoctorPrimary>>(allUnVerifiedDoctors, HttpStatus.OK);
    	}
    	catch (Exception e)
    	{
    		return new ResponseEntity<>(null, HttpStatus.OK);
    	}
    
    }
	@CrossOrigin("http://localhost:3000")
    @PostMapping("/admin/login")
    public ResponseEntity<Boolean> loginAdmin(@RequestBody AdminPrimary adminPrimary)
    {
    	boolean isPresent = this.loginService.ValidateAdmin(adminPrimary);
    	return new ResponseEntity<Boolean>(isPresent, HttpStatus.OK);
    }
}
