package com.project.entity.proxy;

public class FetchDoctorDataProxy {
	
	private int doctorId;

	private String fname;
	private String lname;
	private String email;
	
	private String phoneNumber;
	private char gender;
	
	private String specialization;
	private int yearOfExperience;
	
	private int medicalRegId;
	private String registrationCouncil;
	private String registrationYear;
	private String degree;
	private String college;
	private String yearOfCompletion;
	
	private char establishment;
	private String establishmentName;
	private String establishmentLocation;
	private String establishmentCity;
	
	private String establishmentPin;
	
	private String doctorAvailTime;
	private String doctorAvailDay;
	private Float fees;
	public FetchDoctorDataProxy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FetchDoctorDataProxy(int doctorId, int securityQuestions, String securityQuestionsAnswer, String fname,
			String lname, String email, String pwd, String phoneNumber, char gender, String panCard, String adhaarCard,
			String specialization, int yearOfExperience, int medicalRegId, String registrationCouncil,
			String registrationYear, String degree, String college, String yearOfCompletion, char establishment,
			String establishmentName, String establishmentLocation, String establishmentCity, String establishmentProof,
			String establishmentPin, String doctorAvailTime, String doctorAvailDay, Float fees) {
		super();
		this.doctorId = doctorId;
		
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		
		
		this.specialization = specialization;
		this.yearOfExperience = yearOfExperience;
		this.medicalRegId = medicalRegId;
		this.registrationCouncil = registrationCouncil;
		this.registrationYear = registrationYear;
		this.degree = degree;
		this.college = college;
		this.yearOfCompletion = yearOfCompletion;
		this.establishment = establishment;
		this.establishmentName = establishmentName;
		this.establishmentLocation = establishmentLocation;
		this.establishmentCity = establishmentCity;
		
		this.establishmentPin = establishmentPin;
		this.doctorAvailTime = doctorAvailTime;
		this.doctorAvailDay = doctorAvailDay;
		this.fees = fees;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public int getMedicalRegId() {
		return medicalRegId;
	}
	public void setMedicalRegId(int medicalRegId) {
		this.medicalRegId = medicalRegId;
	}
	public String getRegistrationCouncil() {
		return registrationCouncil;
	}
	public void setRegistrationCouncil(String registrationCouncil) {
		this.registrationCouncil = registrationCouncil;
	}
	public String getRegistrationYear() {
		return registrationYear;
	}
	public void setRegistrationYear(String registrationYear) {
		this.registrationYear = registrationYear;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getYearOfCompletion() {
		return yearOfCompletion;
	}
	public void setYearOfCompletion(String yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
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
	
	public String getEstablishmentPin() {
		return establishmentPin;
	}
	public void setEstablishmentPin(String establishmentPin) {
		this.establishmentPin = establishmentPin;
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
