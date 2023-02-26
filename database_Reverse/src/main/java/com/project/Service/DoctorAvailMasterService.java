package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.DoctorAvailMasterRepository;
import com.project.entity.DoctorAvailMaster;
import com.project.entity.proxy.DoctorAvailMasterProxy;

@Service
public class DoctorAvailMasterService {
	@Autowired
	private DoctorAvailMasterRepository doctorAvailMasterRepository;
	
	public DoctorAvailMaster insertDoctorAvailability(DoctorAvailMaster master)
	{
		return this.doctorAvailMasterRepository.save(master);
	}
	
	public DoctorAvailMasterProxy getDoctorAvailInfo(Integer Id)
	{
		DoctorAvailMaster master =  this.doctorAvailMasterRepository.getById(Id);
		DoctorAvailMasterProxy proxy = new DoctorAvailMasterProxy();
		proxy.setDoctorAvailDay(master.getDoctorAvailDay());
		proxy.setDoctorAvailTime(master.getDoctorAvailTime());
		proxy.setDoctorId(master.getDoctorId());
		proxy.setFees(master.getFees());
		return proxy;
	}
}
