package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.entity.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	//@Query(value = "insert into commit_activity_link (commit_id, activity_id) VALUES (?1, ?2)", nativeQuery = true)
	//@Query(value = "insert into address (Address_line_1,User_State,City,PinCode,Country) values (?1,?2,?3,?4,?5)",nativeQuery = true)
	//public void insertAddressWithNativeQuery(String address_line1,String User_State,String City,String PinCode,String Country);
	
	
	@Query(value = "select Address_ID from address where Address_line_1 = ?1 and city = ?2 and PinCode = ?3",nativeQuery = true)
	public int getAddressBySearch(String address_line1,String city,String PinCode);
}
