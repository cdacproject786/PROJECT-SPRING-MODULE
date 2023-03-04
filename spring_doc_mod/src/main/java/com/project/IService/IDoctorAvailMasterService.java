package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.entity.DoctorAvailMaster;
import com.project.entity.proxy.DoctorAvailMasterProxy;
@Service
public interface IDoctorAvailMasterService {

	public DoctorAvailMaster insertDoctorAvailability(DoctorAvailMaster master);
	
	public DoctorAvailMasterProxy getDoctorAvailInfo(Integer Id);
}
