package com.project.entity;
// Generated 24-Feb-2023, 5:59:39 pm by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DoctorAvailMaster generated by hbm2java
 */
@Entity
@Table(name = "doctor_avail_master", catalog = "project23")
public class DoctorAvailMaster implements java.io.Serializable {

	private Integer doctorId;
	private String doctorAvailTime;
	private String doctorAvailDay;
	private Float fees;
	//private Date lastUpdated;
	//private String extraCol1;
	//private String extraCol2;
	//private String extraCol3;
	//private DoctorPrimary doctorPrimary;

	public DoctorAvailMaster() {
	}

	public DoctorAvailMaster(String doctorAvailTime, String doctorAvailDay, Float fees) {
		this.doctorAvailTime = doctorAvailTime;
		this.doctorAvailDay = doctorAvailDay;
		this.fees = fees;
	}

	public DoctorAvailMaster(String doctorAvailTime, String doctorAvailDay, Float fees, Date lastUpdated,
			String extraCol1, String extraCol2, String extraCol3, DoctorPrimary doctorPrimary) {
		this.doctorAvailTime = doctorAvailTime;
		this.doctorAvailDay = doctorAvailDay;
		this.fees = fees;
		//this.lastUpdated = lastUpdated;
		//this.extraCol1 = extraCol1;
		//this.extraCol2 = extraCol2;
		//this.extraCol3 = extraCol3;
		//this.doctorPrimary = doctorPrimary;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Doctor_ID", unique = true, nullable = false)
	public Integer getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	@Column(name = "Doctor_Avail_Time", nullable = false, length = 20)
	public String getDoctorAvailTime() {
		return this.doctorAvailTime;
	}

	public void setDoctorAvailTime(String doctorAvailTime) {
		this.doctorAvailTime = doctorAvailTime;
	}

	@Column(name = "Doctor_Avail_Day", nullable = false, length = 20)
	public String getDoctorAvailDay() {
		return this.doctorAvailDay;
	}

	public void setDoctorAvailDay(String doctorAvailDay) {
		this.doctorAvailDay = doctorAvailDay;
	}

	@Column(name = "Fees", nullable = false, precision = 10)
	public Float getFees() {
		return this.fees;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}

	/*
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "Last_Updated", length = 19) public Date getLastUpdated() {
	 * return this.lastUpdated; }
	 * 
	 * public void setLastUpdated(Date lastUpdated) { this.lastUpdated =
	 * lastUpdated; }
	 * 
	 * @Column(name = "Extra_Col1", length = 200) public String getExtraCol1() {
	 * return this.extraCol1; }
	 * 
	 * public void setExtraCol1(String extraCol1) { this.extraCol1 = extraCol1; }
	 * 
	 * @Column(name = "Extra_Col2", length = 200) public String getExtraCol2() {
	 * return this.extraCol2; }
	 * 
	 * public void setExtraCol2(String extraCol2) { this.extraCol2 = extraCol2; }
	 * 
	 * @Column(name = "Extra_Col3", length = 200) public String getExtraCol3() {
	 * return this.extraCol3; }
	 * 
	 * public void setExtraCol3(String extraCol3) { this.extraCol3 = extraCol3; }
	 * 
	 * @OneToOne(fetch = FetchType.LAZY, mappedBy = "doctorAvailMaster") public
	 * DoctorPrimary getDoctorPrimary() { return this.doctorPrimary; }
	 * 
	 * public void setDoctorPrimary(DoctorPrimary doctorPrimary) {
	 * this.doctorPrimary = doctorPrimary; }
	 */

}
