package com.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.project.entity.PatientMedLog;

public interface PatientMedLogRepository extends JpaRepository<PatientMedLog, String> {
	
	public List<PatientMedLog> findByuid(int uid);

}
