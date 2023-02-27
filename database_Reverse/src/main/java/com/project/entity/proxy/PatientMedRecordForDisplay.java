package com.project.entity.proxy;

public class PatientMedRecordForDisplay {
	
	private String bloodPressure;
	private Double weight;
	private String sugarLevel;
	private String bloodGroup;
	public PatientMedRecordForDisplay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientMedRecordForDisplay(String bloodPressure, Double weight, String sugarLevel, String bloodGroup) {
		super();
		this.bloodPressure = bloodPressure;
		this.weight = weight;
		this.sugarLevel = sugarLevel;
		this.bloodGroup = bloodGroup;
	}
	public String getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getSugarLevel() {
		return sugarLevel;
	}
	public void setSugarLevel(String sugarLevel) {
		this.sugarLevel = sugarLevel;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	
	
	
	

}
