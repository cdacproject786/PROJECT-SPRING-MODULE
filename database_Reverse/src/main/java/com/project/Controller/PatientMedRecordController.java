package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.PatientMedRecordService;
import com.project.entity.proxy.PatientMedRecordForDisplay;

@RestController
public class PatientMedRecordController {

	@Autowired
	PatientMedRecordService patientMedRecordService;
	
	@GetMapping("/patient/medrecord/{abhaaNumber}")
	public PatientMedRecordForDisplay getPatientMedRecord(@PathVariable String abhaaNumber)
	{
		return this.patientMedRecordService.getRecord(abhaaNumber);
	}
}
