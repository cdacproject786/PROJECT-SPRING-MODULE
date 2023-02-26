package com.project.entity.proxy;

public class AddressProxy {
	
	private Integer addressId;
	private String addressLine1;
	private String userState;
	private String city;
	private String pinCode;
	private String country;
	public AddressProxy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressProxy(Integer addressId, String addressLine1, String userState, String city, String pinCode,
			String country) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.userState = userState;
		this.city = city;
		this.pinCode = pinCode;
		this.country = country;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
