package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.DoctorEstablishmentRepository;
import com.project.entity.DoctorEstablishment;
import com.project.entity.proxy.DoctorEstablishmentProxy;

@Service
public class DoctorEstablishmentService {

	@Autowired
	private DoctorEstablishmentRepository doctorEstablishmentRepository;
	
	public DoctorEstablishment insertDoctorEstablishmentData(DoctorEstablishment establishment)
	{
		return this.doctorEstablishmentRepository.save(establishment);
	}
	
	public DoctorEstablishmentProxy getDoctorEstablishmentById(Integer id)
	{
		DoctorEstablishment establishment =  this.doctorEstablishmentRepository.getById(id);
		DoctorEstablishmentProxy proxy = new DoctorEstablishmentProxy();
		proxy.setEid(establishment.getEid());
		proxy.setEstablishment(establishment.getEstablishment());
		proxy.setEstablishmentCity(establishment.getEstablishmentCity());
		proxy.setEstablishmentLocation(establishment.getEstablishmentCity());
		proxy.setEstablishmentName(establishment.getEstablishmentName());
		proxy.setEstablishmentPin(establishment.getEstablishmentPin());
		proxy.setEstablishmentProof(establishment.getEstablishmentProof());
		return proxy;
	}
}
