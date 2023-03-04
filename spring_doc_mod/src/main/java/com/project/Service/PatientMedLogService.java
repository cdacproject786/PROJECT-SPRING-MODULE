package com.project.Service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.IService.IPatientMedLogService;
import com.project.Repository.PatientMedLogRepository;
import com.project.entity.PatientMedLog;
@Service
public class PatientMedLogService implements IPatientMedLogService {

	@Autowired
	private PatientMedLogRepository patientMedLogRepository;
	
	public void insertPatientMedLog(List<PatientMedLog> patientMedLogs)
	{
		Iterator<PatientMedLog> iterator=patientMedLogs.iterator();
		
		while(iterator.hasNext()) { 
			PatientMedLog patientToInsert=iterator.next();
			this.patientMedLogRepository.save(patientToInsert);
		}
	}
}
