package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.DoctorAvailMasterService;
import com.project.entity.DoctorAvailMaster;
import com.project.entity.proxy.DoctorAvailMasterProxy;

@RestController
public class DoctorAvailMasterController {
	@Autowired
	private DoctorAvailMasterService doctorAvailMasterService;
	
	@PostMapping("doctor/avail")
	public DoctorAvailMaster insertAvailability(@RequestBody DoctorAvailMaster master)
	{
		return this.doctorAvailMasterService.insertDoctorAvailability(master);
	}
	
	@GetMapping("/doctor/avail/{id}")
	public DoctorAvailMasterProxy getDoctorAvailability(@PathVariable Integer id)
	{
		return this.doctorAvailMasterService.getDoctorAvailInfo(id);
	}
}
