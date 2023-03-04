package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.entity.DoctorEstablishment;
import com.project.entity.proxy.DoctorEstablishmentProxy;
@Service
public interface IDoctorEstablishmentService {
	
	public DoctorEstablishment insertDoctorEstablishmentData(DoctorEstablishment establishment);
	
	public DoctorEstablishmentProxy getDoctorEstablishmentById(Integer id);

}
