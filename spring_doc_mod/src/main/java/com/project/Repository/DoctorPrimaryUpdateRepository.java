package com.project.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class DoctorPrimaryUpdateRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void UpdateDoctor(int id)
	{
		entityManager.createNativeQuery("UPDATE Doctor_Primary SET Profile_Status = 'V' WHERE doctor_Id =?")
		.setParameter(1, id)
		.executeUpdate();
	}
}
