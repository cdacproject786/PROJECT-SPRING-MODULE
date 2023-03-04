package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.entity.proxy.PatientMedRecordForDisplay;
@Service
public interface IPatientMedRecordService {

	public PatientMedRecordForDisplay getRecord(String abhaaNumber);
}
