package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.DoctorAvailMasterRepository;
import com.project.Repository.DoctorEstablishmentRepository;
import com.project.Repository.DoctorMedRegistrationRepository;
import com.project.Repository.DoctorPrimaryRepository;
import com.project.entity.DoctorAvailMaster;
import com.project.entity.DoctorEstablishment;
import com.project.entity.DoctorMedRegistration;
import com.project.entity.DoctorPrimary;
import com.project.entity.proxy.FetchDoctorDataProxy;
import com.project.exception.DataDoesntExistException;

@Service
public class FetchEntireDoctorDataService {
	
	@Autowired
	private DoctorPrimaryRepository doctorPrimaryRepository;
	
	@Autowired
	private DoctorMedRegistrationRepository doctorMedRegistrationRepository;
	
	@Autowired
	private DoctorEstablishmentRepository doctorEstablishmentRepository;
	
	@Autowired
	private DoctorAvailMasterRepository doctorAvailMasterRepository;
	
	public FetchDoctorDataProxy getDoctorData(String email) throws DataDoesntExistException
	{
		DoctorPrimary primary = this.doctorPrimaryRepository.findByemail(email);
		if(primary == null)
			throw new DataDoesntExistException("There is no doctor available with given email id");
		else
		{
			int availId = primary.getDoctorId();
			int establishmentId = primary.getDoctorEstablishment();
			int medRegistration = primary.getDoctorMedRegistration();
			//all the necessary foreign keys are fetched here 
			//getting the data from database for the above foreign keys
			
			DoctorMedRegistration registration = this.doctorMedRegistrationRepository.findBymedicalRegId(medRegistration);
			DoctorEstablishment establishment = this.doctorEstablishmentRepository.findByeid(establishmentId);
			DoctorAvailMaster master = this.doctorAvailMasterRepository.findBydoctorId(availId);
			
			//setting the data to FetchDoctorDataProxy
			FetchDoctorDataProxy proxy = new FetchDoctorDataProxy();
			proxy.setDoctorId(primary.getDoctorId());
			proxy.setFname(primary.getFname());
			proxy.setLname(primary.getLname());
			proxy.setEmail(primary.getEmail());
			proxy.setPhoneNumber(primary.getPhoneNumber());
			proxy.setGender(primary.getGender());
			proxy.setSpecialization(primary.getSpecialization());
			proxy.setYearOfExperience(primary.getYearOfExperience());
			proxy.setMedicalRegId(registration.getMedicalRegId());
			proxy.setRegistrationCouncil(registration.getRegistrationCouncil());
			proxy.setRegistrationYear(registration.getRegistrationYear());
			proxy.setYearOfCompletion(registration.getYearOfCompletion());
			proxy.setDegree(registration.getDegree());
			proxy.setCollege(registration.getCollege());
			proxy.setEstablishment(establishment.getEstablishment());
			proxy.setEstablishmentName(establishment.getEstablishmentName());
			proxy.setEstablishmentLocation(establishment.getEstablishmentLocation());
			proxy.setEstablishmentCity(establishment.getEstablishmentCity());
			proxy.setEstablishmentPin(establishment.getEstablishmentPin());
			proxy.setDoctorAvailDay(master.getDoctorAvailDay());
			proxy.setDoctorAvailTime(master.getDoctorAvailTime());
			proxy.setFees(master.getFees());
			return proxy;
		}
	}
}
