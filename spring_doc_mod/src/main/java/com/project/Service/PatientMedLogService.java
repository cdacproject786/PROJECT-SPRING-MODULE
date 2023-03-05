package com.project.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.IService.IPatientMedLogService;
import com.project.Repository.PatientMedLogRepository;
import com.project.Repository.PatientPrimaryRepository;
import com.project.entity.Address;
import com.project.entity.PatientMedLog;
import com.project.entity.PatientPrimary;
import com.project.entity.proxy.AddressProxy;
import com.project.entity.proxy.PatientMedLogProxy;
@Service
public class PatientMedLogService implements IPatientMedLogService {

	@Autowired
	private PatientMedLogRepository patientMedLogRepository;
	
	@Autowired
	private PatientPrimaryRepository patientPrimaryRepository;
	
	
	public void insertPatientMedLog(List<PatientMedLog> patientMedLogs,String email)
	{
		PatientPrimary patient = this.patientPrimaryRepository.findByemail(email);
		
		Iterator<PatientMedLog> iteratorForSetId=patientMedLogs.iterator();
		
		while(iteratorForSetId.hasNext())
		iteratorForSetId.next().setuid(patient.getUid());//setting the uid one by one
			
		
		
		Iterator<PatientMedLog> iteratorForInsertion=patientMedLogs.iterator();
		
		while(iteratorForInsertion.hasNext()) { 
			PatientMedLog patientToInsert=iteratorForInsertion.next();
			this.patientMedLogRepository.save(patientToInsert);
		}
	}
	
	public List<PatientMedLog> getPatientMedLogById(String email)
	{
		//ArrayList<Integer> list=new ArrayList<Integer>();
		//Retrieving the patient primary object for UID
		PatientPrimary patientPrimary = this.patientPrimaryRepository.findByemail(email);
		
		int uid=patientPrimary.getUid();
		
		//list.add(uid);
		
		
		//PatientMedLog patientMedLog = this.patientMedLogRepository.getById(uid);
		List<PatientMedLog> patientMedLogs = this.patientMedLogRepository.findByuid(uid);
		
		
		
		return patientMedLogs;
		
	}
}
