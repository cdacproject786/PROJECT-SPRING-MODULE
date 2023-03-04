package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.entity.DoctorPrimary;
@Service
public interface IDoctorPrimaryServive {

	public DoctorPrimary insertDoctor(DoctorPrimary doctorPrimary);
}
