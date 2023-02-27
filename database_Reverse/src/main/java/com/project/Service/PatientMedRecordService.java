package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.proxy.PatientMedRecordForDisplay;

@Service
public class PatientMedRecordService {
	
	public PatientMedRecordForDisplay getRecord(String abhaaNumber)
	{
		return com.project.jdbc.utils.PatientMedRecordRepository.getPatientMedRecord(abhaaNumber);
	}
	
	
	
}
