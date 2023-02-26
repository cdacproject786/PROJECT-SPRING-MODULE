package com.project.entity.proxy;

import com.project.entity.Address;
import com.project.entity.DoctorAvailMaster;
import com.project.entity.DoctorEstablishment;
import com.project.entity.DoctorMedRegistration;
import com.project.entity.SecurityQuestions;

public class DoctorPrimaryRegistrationProxy {
    //attributes of address class
	private Integer addressId;
	private String addressLine1;
	private String userState;
	private String city;
	private String pinCode;
	private String country;
	
	//attributes of DoctorAvailMaster
	private Integer doctorId;
	private String doctorAvailTime;
	private String doctorAvailDay;
	private Float fees;
	
	//attributes of DoctorEstablishment
	private Integer eid;
	private char establishment;
	private String establishmentName;
	private String establishmentLocation;
	private String establishmentCity;
	private String establishmentProof;
	private String establishmentPin;
	
	//attributes of doctormedregistration
	private Integer medicalRegId;
	private String registrationCouncil;
	private String registrationYear;
	private String degree;
	private String college;
	private String yearOfCompletion;
	
	//attributes of doctorPrimary
	
	private int address;
	private int doctorAvailMaster;
	private int doctorEstablishment;
	private int doctorMedRegistration;
	private int securityQuestions;
	private String securityQuestionsAnswer;
	private String fname;
	private String lname;
	private String email;
	private String pwd;
	private String phoneNumber;
	private char gender;
	private String panCard;
	private String adhaarCard;
	private String specialization;
	private int yearOfExperience;
	private char profileStatus;
	
	//attributes of security questions
	private Integer securityQuestionsId;
	private String securityQuestion;
	
	public DoctorPrimaryRegistrationProxy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorPrimaryRegistrationProxy(Integer addressId, String addressLine1, String userState, String city,
			String pinCode, String country, Integer doctorId, String doctorAvailTime, String doctorAvailDay, Float fees,
			Integer eid, char establishment, String establishmentName, String establishmentLocation,
			String establishmentCity, String establishmentProof, String establishmentPin, Integer medicalRegId,
			String registrationCouncil, String registrationYear, String degree, String college, String yearOfCompletion,
			int address, int doctorAvailMaster, int doctorEstablishment, int doctorMedRegistration,
			int securityQuestions, String securityQuestionsAnswer, String fname, String lname, String email, String pwd,
			String phoneNumber, char gender, String panCard, String adhaarCard, String specialization,
			int yearOfExperience, char profileStatus, Integer securityQuestionsId, String securityQuestion) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.userState = userState;
		this.city = city;
		this.pinCode = pinCode;
		this.country = country;
		this.doctorId = doctorId;
		this.doctorAvailTime = doctorAvailTime;
		this.doctorAvailDay = doctorAvailDay;
		this.fees = fees;
		this.eid = eid;
		this.establishment = establishment;
		this.establishmentName = establishmentName;
		this.establishmentLocation = establishmentLocation;
		this.establishmentCity = establishmentCity;
		this.establishmentProof = establishmentProof;
		this.establishmentPin = establishmentPin;
		this.medicalRegId = medicalRegId;
		this.registrationCouncil = registrationCouncil;
		this.registrationYear = registrationYear;
		this.degree = degree;
		this.college = college;
		this.yearOfCompletion = yearOfCompletion;
		this.address = address;
		this.doctorAvailMaster = doctorAvailMaster;
		this.doctorEstablishment = doctorEstablishment;
		this.doctorMedRegistration = doctorMedRegistration;
		this.securityQuestions = securityQuestions;
		this.securityQuestionsAnswer = securityQuestionsAnswer;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pwd = pwd;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.panCard = panCard;
		this.adhaarCard = adhaarCard;
		this.specialization = specialization;
		this.yearOfExperience = yearOfExperience;
		this.profileStatus = profileStatus;
		this.securityQuestionsId = securityQuestionsId;
		this.securityQuestion = securityQuestion;
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
	public Integer getMedicalRegId() {
		return medicalRegId;
	}
	public void setMedicalRegId(Integer medicalRegId) {
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
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public int getDoctorAvailMaster() {
		return doctorAvailMaster;
	}
	public void setDoctorAvailMaster(int doctorAvailMaster) {
		this.doctorAvailMaster = doctorAvailMaster;
	}
	public int getDoctorEstablishment() {
		return doctorEstablishment;
	}
	public void setDoctorEstablishment(int doctorEstablishment) {
		this.doctorEstablishment = doctorEstablishment;
	}
	public int getDoctorMedRegistration() {
		return doctorMedRegistration;
	}
	public void setDoctorMedRegistration(int doctorMedRegistration) {
		this.doctorMedRegistration = doctorMedRegistration;
	}
	public int getSecurityQuestions() {
		return securityQuestions;
	}
	public void setSecurityQuestions(int securityQuestions) {
		this.securityQuestions = securityQuestions;
	}
	public String getSecurityQuestionsAnswer() {
		return securityQuestionsAnswer;
	}
	public void setSecurityQuestionsAnswer(String securityQuestionsAnswer) {
		this.securityQuestionsAnswer = securityQuestionsAnswer;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getAdhaarCard() {
		return adhaarCard;
	}
	public void setAdhaarCard(String adhaarCard) {
		this.adhaarCard = adhaarCard;
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
	public char getProfileStatus() {
		return profileStatus;
	}
	public void setProfileStatus(char profileStatus) {
		this.profileStatus = profileStatus;
	}
	public Integer getSecurityQuestionsId() {
		return securityQuestionsId;
	}
	public void setSecurityQuestionsId(Integer securityQuestionsId) {
		this.securityQuestionsId = securityQuestionsId;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	
	
	
}
