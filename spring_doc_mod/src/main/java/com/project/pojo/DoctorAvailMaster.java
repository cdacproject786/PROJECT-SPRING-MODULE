package com.project.pojo;
// Generated 24-Feb-2023, 5:28:10 pm by Hibernate Tools 5.4.33.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * DoctorAvailMaster generated by hbm2java
 */
public class DoctorAvailMaster implements java.io.Serializable {

	private Integer doctorId;
	private String doctorAvailTime;
	private String doctorAvailDay;
	private BigDecimal fees;
	private Date lastUpdated;
	private String extraCol1;
	private String extraCol2;
	private String extraCol3;
	private DoctorPrimary doctorPrimary;

	public DoctorAvailMaster() {
	}

	public DoctorAvailMaster(String doctorAvailTime, String doctorAvailDay, BigDecimal fees) {
		this.doctorAvailTime = doctorAvailTime;
		this.doctorAvailDay = doctorAvailDay;
		this.fees = fees;
	}

	public DoctorAvailMaster(String doctorAvailTime, String doctorAvailDay, BigDecimal fees, Date lastUpdated,
			String extraCol1, String extraCol2, String extraCol3, DoctorPrimary doctorPrimary) {
		this.doctorAvailTime = doctorAvailTime;
		this.doctorAvailDay = doctorAvailDay;
		this.fees = fees;
		this.lastUpdated = lastUpdated;
		this.extraCol1 = extraCol1;
		this.extraCol2 = extraCol2;
		this.extraCol3 = extraCol3;
		this.doctorPrimary = doctorPrimary;
	}

	public Integer getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorAvailTime() {
		return this.doctorAvailTime;
	}

	public void setDoctorAvailTime(String doctorAvailTime) {
		this.doctorAvailTime = doctorAvailTime;
	}

	public String getDoctorAvailDay() {
		return this.doctorAvailDay;
	}

	public void setDoctorAvailDay(String doctorAvailDay) {
		this.doctorAvailDay = doctorAvailDay;
	}

	public BigDecimal getFees() {
		return this.fees;
	}

	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getExtraCol1() {
		return this.extraCol1;
	}

	public void setExtraCol1(String extraCol1) {
		this.extraCol1 = extraCol1;
	}

	public String getExtraCol2() {
		return this.extraCol2;
	}

	public void setExtraCol2(String extraCol2) {
		this.extraCol2 = extraCol2;
	}

	public String getExtraCol3() {
		return this.extraCol3;
	}

	public void setExtraCol3(String extraCol3) {
		this.extraCol3 = extraCol3;
	}

	public DoctorPrimary getDoctorPrimary() {
		return this.doctorPrimary;
	}

	public void setDoctorPrimary(DoctorPrimary doctorPrimary) {
		this.doctorPrimary = doctorPrimary;
	}

}
