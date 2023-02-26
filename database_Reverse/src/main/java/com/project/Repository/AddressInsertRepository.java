package com.project.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.entity.Address;

@Repository
public class AddressInsertRepository {

	 @PersistenceContext
	 private EntityManager entityManager;
	 
	 @Transactional
	 public void insertWithQuery(Address address)
	 {
		 entityManager.createNativeQuery("insert into address (Address_line_1,User_State,City,PinCode,Country) values (?,?,?,?,?)")
		 .setParameter(1, address.getAddressLine1())
		 .setParameter(2, address.getUserState())
		 .setParameter(3, address.getCity())
		 .setParameter(4, address.getPinCode())
		 .setParameter(5, address.getCountry())
		 .executeUpdate();
	 }
}
