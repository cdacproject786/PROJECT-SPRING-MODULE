package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.Service.AddressService;
import com.project.entity.Address;
import com.project.entity.proxy.AddressProxy;

@RestController
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/doctor/address")
	public void addAddress(@RequestBody Address address)
	{	
		this.addressService.insertAddress(address);
	}
	
	public Address insertAddress(Address address)
	{
		return this.addressService.insertAddressForDocReg(address);
	}
	
	@GetMapping("/doctor/address/{id}")
	public AddressProxy getAddress(@PathVariable Integer id)
	{
		return this.addressService.getAddressById(id);
	}
	
	@GetMapping("/doctor/test/{id}")
	public AddressProxy testGetAddress(@PathVariable Integer id)
	{
		String url = "http://localhost:9010//doctor/address/"+id;
		RestTemplate template = new RestTemplate();
		AddressProxy result = template.getForObject(url, AddressProxy.class);
		return result;
	}
	
}
