package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.project.Service.AdminService;
import com.project.entity.DoctorPrimary;
import com.project.entity.PatientPrimary;
import com.project.entity.proxy.DoctorPrimaryProxy;
import com.project.entity.proxy.PatientPrimaryProxy;


@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin/retrievealldoctor")
	public List<DoctorPrimary> getAllDoctors()
	{
		return this.adminService.getAllDoctor();
	}
	
	@GetMapping("/admin/retrieveonedoctor/{doctorId}")
	public DoctorPrimaryProxy getOneDoctor(@PathVariable int doctorId)
	{
		return this.adminService.getOneDoctor(doctorId);
	}
	@PostMapping("/admin/verifieddoctor")
	public void updateDoctor(@RequestBody DoctorPrimary doctorPrimary)
	{
		 this.adminService.updateDoctor(doctorPrimary);
	}
	@GetMapping("/admin/retrieveallpatient")
	public List<PatientPrimary> getAllPatient()
	{
		return this.adminService.getAllPatient();
	}
	
	@GetMapping("/admin/retrieveonepatient/{uid}")
	public PatientPrimaryProxy getOnePatient(@PathVariable int uid)
	{
		return this.adminService.getOnePatient(uid);
	}
}