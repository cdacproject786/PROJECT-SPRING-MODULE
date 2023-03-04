package com.project.IService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.PatientMedLog;
@Service
public interface IPatientMedLogService {

	public void insertPatientMedLog(List<PatientMedLog> patientMedLogs);
}
