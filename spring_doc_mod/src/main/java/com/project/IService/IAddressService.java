package com.project.IService;

import org.springframework.stereotype.Service;

import com.project.entity.Address;
import com.project.entity.proxy.AddressProxy;
@Service
public interface IAddressService {
	
	public void insertAddress(Address address);
	
	public AddressProxy getAddressById(Integer id);
	
	public int insertAddressForDocReg(Address address);

}
