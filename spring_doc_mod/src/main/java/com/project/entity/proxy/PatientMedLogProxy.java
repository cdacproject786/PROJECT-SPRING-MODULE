package com.project.entity.proxy;

public class PatientMedLogProxy {

		private String prescription;
		private String med_log_id;
		private String lab_report;
		private String drug_name;
		private byte morning;
		private byte afternoon;
		private byte evening;
		public PatientMedLogProxy() {
			super();
			// TODO Auto-generated constructor stub
		}
		public PatientMedLogProxy(String prescription, String med_log_id, String lab_report, String drug_name,
				byte morning, byte afternoon, byte evening) {
			super();
			this.prescription = prescription;
			this.med_log_id = med_log_id;
			this.lab_report = lab_report;
			this.drug_name = drug_name;
			this.morning = morning;
			this.afternoon = afternoon;
			this.evening = evening;
		}
		public String getPrescription() {
			return prescription;
		}
		public void setPrescription(String prescription) {
			this.prescription = prescription;
		}
		public String getMed_log_id() {
			return med_log_id;
		}
		public void setMed_log_id(String med_log_id) {
			this.med_log_id = med_log_id;
		}
		public String getLab_report() {
			return lab_report;
		}
		public void setLab_report(String lab_report) {
			this.lab_report = lab_report;
		}
		public String getDrug_name() {
			return drug_name;
		}
		public void setDrug_name(String drug_name) {
			this.drug_name = drug_name;
		}
		public byte getMorning() {
			return morning;
		}
		public void setMorning(byte morning) {
			this.morning = morning;
		}
		public byte getAfternoon() {
			return afternoon;
		}
		public void setAfternoon(byte afternoon) {
			this.afternoon = afternoon;
		}
		public byte getEvening() {
			return evening;
		}
		public void setEvening(byte evening) {
			this.evening = evening;
		}
		
		
}
