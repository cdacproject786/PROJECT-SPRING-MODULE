package com.project.entity.proxy;

import java.util.Date;

import com.project.entity.Address;
import com.project.entity.PatientMedRecord;
import com.project.entity.SecurityQuestions;

public class PatientPrimaryProxy {
	
	private int uid;
	private Address address;
	private PatientMedRecord patientMedRecord;
	private SecurityQuestions securityQuestions;
	private String profilePhoto;
	private String fname;
	private String lname;
	private String email;
	private String pwd;
	private Date dateOfBirth;
	private String adhaarCard;
	private String phone;
	private char gender;
	private char maritalStatus;
	private String occupation;
	private String securityQuestionsAnswer;
	//private Date lastUpdated;
	public PatientPrimaryProxy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientPrimaryProxy(int uid, Address address, PatientMedRecord patientMedRecord,
			SecurityQuestions securityQuestions, String profilePhoto, String fname, String lname, String email,
			String pwd, Date dateOfBirth, String adhaarCard, String phone, char gender, char maritalStatus,
			String occupation, String securityQuestionsAnswer) {
		super();
		this.uid = uid;
		this.address = address;
		this.patientMedRecord = patientMedRecord;
		this.securityQuestions = securityQuestions;
		this.profilePhoto = profilePhoto;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pwd = pwd;
		this.dateOfBirth = dateOfBirth;
		this.adhaarCard = adhaarCard;
		this.phone = phone;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.occupation = occupation;
		this.securityQuestionsAnswer = securityQuestionsAnswer;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PatientMedRecord getPatientMedRecord() {
		return patientMedRecord;
	}
	public void setPatientMedRecord(PatientMedRecord patientMedRecord) {
		this.patientMedRecord = patientMedRecord;
	}
	public SecurityQuestions getSecurityQuestions() {
		return securityQuestions;
	}
	public void setSecurityQuestions(SecurityQuestions securityQuestions) {
		this.securityQuestions = securityQuestions;
	}
	public String getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAdhaarCard() {
		return adhaarCard;
	}
	public void setAdhaarCard(String adhaarCard) {
		this.adhaarCard = adhaarCard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(char maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getSecurityQuestionsAnswer() {
		return securityQuestionsAnswer;
	}
	public void setSecurityQuestionsAnswer(String securityQuestionsAnswer) {
		this.securityQuestionsAnswer = securityQuestionsAnswer;
	}
	
	
}
