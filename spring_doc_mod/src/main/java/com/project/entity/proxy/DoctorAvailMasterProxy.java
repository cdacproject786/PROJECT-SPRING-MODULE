package com.project.entity.proxy;

public class DoctorAvailMasterProxy {

	private Integer doctorId;
	private String doctorAvailTime;
	private String doctorAvailDay;
	private Float fees;
	
	public DoctorAvailMasterProxy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorAvailMasterProxy(Integer doctorId, String doctorAvailTime, String doctorAvailDay, Float fees) {
		super();
		this.doctorId = doctorId;
		this.doctorAvailTime = doctorAvailTime;
		this.doctorAvailDay = doctorAvailDay;
		this.fees = fees;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorAvailTime() {
		return doctorAvailTime;
	}

	public void setDoctorAvailTime(String doctorAvailTime) {
		this.doctorAvailTime = doctorAvailTime;
	}

	public String getDoctorAvailDay() {
		return doctorAvailDay;
	}

	public void setDoctorAvailDay(String doctorAvailDay) {
		this.doctorAvailDay = doctorAvailDay;
	}

	public Float getFees() {
		return fees;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}
	
	
	
}
