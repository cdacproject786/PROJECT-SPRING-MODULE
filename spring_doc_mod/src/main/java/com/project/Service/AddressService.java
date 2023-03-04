package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.IService.IAddressService;
import com.project.Repository.AddressInsertRepository;
import com.project.Repository.AddressRepository;
import com.project.entity.Address;
import com.project.entity.proxy.AddressProxy;

@Service
public class AddressService implements IAddressService{
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private AddressInsertRepository addressInsertRepository;
	
	public void insertAddress(Address address)
	{
		this.addressInsertRepository.insertWithQuery(address);
	}
	public AddressProxy getAddressById(Integer id)
	{
		
		Address address =  this.addressRepository.getById(id);
		AddressProxy proxy = new AddressProxy();
		proxy.setAddressId(address.getAddressId());
		proxy.setAddressLine1(address.getAddressLine1());
		proxy.setCity(address.getCity());
		proxy.setCountry(address.getCountry());
		proxy.setPinCode(address.getPinCode());
		proxy.setUserState(address.getUserState());
		return proxy;
		
	}
	
	public int insertAddressForDocReg(Address address)
	{
		
		this.addressInsertRepository.insertWithQuery(address);
		System.out.println("Address insertedsuccess fully");
		return  this.addressRepository.getAddressBySearch(address.getAddressLine1(), address.getCity(), address.getPinCode());
	}
	
}
