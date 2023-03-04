package com.project.Controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.PatientMedLogService;
import com.project.entity.PatientMedLog;
import com.project.entity.proxy.PatientMedLogProxy;


@RestController
public class PatientMedLogController {

	@Autowired
	PatientMedLogService patientMedLogService;
	
	@PostMapping("/patient/medlog")
	public void addPatientMedLog(@RequestBody List<PatientMedLog> patientMedLogs)
	{			
			this.patientMedLogService.insertPatientMedLog(patientMedLogs);
		
		
	}	
//	
//	@GetMapping("/patient/medlog/{id}")//To be written
//	public PatientMedLogProxy getPatientMedLog(@PathVariable Integer id)
//	{
//		return this.patientMedLogService.getPatientMedLogById(id);
//	}
//	
}
