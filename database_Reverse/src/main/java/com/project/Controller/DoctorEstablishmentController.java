package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.DoctorEstablishmentService;
import com.project.entity.DoctorEstablishment;
import com.project.entity.proxy.DoctorEstablishmentProxy;

@RestController
public class DoctorEstablishmentController {
	
	@Autowired
	private DoctorEstablishmentService doctorEstablishmentService;
	
	@PostMapping("/doctor/establishment")
	public DoctorEstablishment insertEstablishment(@RequestBody DoctorEstablishment establishment)
	{
		return this.doctorEstablishmentService.insertDoctorEstablishmentData(establishment);
	}
	
	@GetMapping("/doctor/establishment/{id}")
	public DoctorEstablishmentProxy getDoctorEstablishmentById(@PathVariable Integer id)
	{
		return this.doctorEstablishmentService.getDoctorEstablishmentById(id);
	}
}