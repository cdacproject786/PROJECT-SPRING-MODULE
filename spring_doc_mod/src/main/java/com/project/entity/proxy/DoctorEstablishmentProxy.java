package com.project.entity.proxy;

public class DoctorEstablishmentProxy {

	private Integer eid;
	private char establishment;
	private String establishmentName;
	private String establishmentLocation;
	private String establishmentCity;
	private String establishmentProof;
	private String establishmentPin;
	public DoctorEstablishmentProxy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorEstablishmentProxy(Integer eid, char establishment, String establishmentName,
			String establishmentLocation, String establishmentCity, String establishmentProof,
			String establishmentPin) {
		super();
		this.eid = eid;
		this.establishment = establishment;
		this.establishmentName = establishmentName;
		this.establishmentLocation = establishmentLocation;
		this.establishmentCity = establishmentCity;
		this.establishmentProof = establishmentProof;
		this.establishmentPin = establishmentPin;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public char getEstablishment() {
		return establishment;
	}
	public void setEstablishment(char establishment) {
		this.establishment = establishment;
	}
	public String getEstablishmentName() {
		return establishmentName;
	}
	public void setEstablishmentName(String establishmentName) {
		this.establishmentName = establishmentName;
	}
	public String getEstablishmentLocation() {
		return establishmentLocation;
	}
	public void setEstablishmentLocation(String establishmentLocation) {
		this.establishmentLocation = establishmentLocation;
	}
	public String getEstablishmentCity() {
		return establishmentCity;
	}
	public void setEstablishmentCity(String establishmentCity) {
		this.establishmentCity = establishmentCity;
	}
	public String getEstablishmentProof() {
		return establishmentProof;
	}
	public void setEstablishmentProof(String establishmentProof) {
		this.establishmentProof = establishmentProof;
	}
	public String getEstablishmentPin() {
		return establishmentPin;
	}
	public void setEstablishmentPin(String establishmentPin) {
		this.establishmentPin = establishmentPin;
	}
	
	
}
