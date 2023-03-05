package com.project.entity.proxy;

public class DoctorPrimaryProxy {

	private int doctorId;
	private int address;
	//private int doctorAvailMaster;
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
	private String profilePhoto;
	//private Date lastUpdated;
	//private String extraCol1;
	//private String extraCol2;
	//private String extraCol3;
	public DoctorPrimaryProxy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorPrimaryProxy(int doctorId, int address, int doctorAvailMaster, int doctorEstablishment,
			int doctorMedRegistration, int securityQuestions, String securityQuestionsAnswer, String fname,
			String lname, String email, String pwd, String phoneNumber, char gender, String panCard, String adhaarCard,
			String specialization, int yearOfExperience, char profileStatus, String profilePhoto) {
		super();
		this.doctorId = doctorId;
		this.address = address;
		//this.doctorAvailMaster = doctorAvailMaster;
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
		this.profilePhoto = profilePhoto;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
//	public int getDoctorAvailMaster() {
//		return doctorAvailMaster;
//	}
//	public void setDoctorAvailMaster(int doctorAvailMaster) {
//		this.doctorAvailMaster = doctorAvailMaster;
//	}
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
	public String getProfilePhoto() {
		return profilePhoto;
	}
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

}
