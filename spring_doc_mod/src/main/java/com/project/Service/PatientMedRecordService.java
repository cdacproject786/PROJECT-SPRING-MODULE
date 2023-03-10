package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.IService.IPatientMedRecordService;
import com.project.entity.proxy.PatientMedRecordForDisplay;

@Service
public class PatientMedRecordService implements IPatientMedRecordService{
	
	public PatientMedRecordForDisplay getRecord(String abhaaNumber)
	{
		try
		{
			return com.project.jdbc.utils.PatientMedRecordRepository.getPatientMedRecord(abhaaNumber);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	
}
