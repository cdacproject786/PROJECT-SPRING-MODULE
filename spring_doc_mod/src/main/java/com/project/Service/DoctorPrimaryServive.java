package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.DoctorPrimaryRepository;
import com.project.entity.DoctorPrimary;

@Service
public class DoctorPrimaryServive {

	@Autowired 
	private DoctorPrimaryRepository doctorPrimaryRepository;
	
	public DoctorPrimary insertDoctor(DoctorPrimary doctorPrimary)
	{
		return this.doctorPrimaryRepository.save(doctorPrimary);
	}
	
}
