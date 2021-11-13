package com.java.inquries.beans;

public class ProfessorBean {
	private int profId;
	private String profFirstName;
	private String profLastName;
	private int profPassYear;
	private String genderType;
	private String profEmail;
	private long mobileNumber;
	private int exprc;
	public ProfessorBean(int profId, String profFirstName, String profLastName, int profPassYear, String genderType,
			String profEmail, long mobileNumber, int exprc) {
		super();
		this.profId = profId;
		this.profFirstName = profFirstName;
		this.profLastName = profLastName;
		this.profPassYear = profPassYear;
		this.genderType = genderType;
		this.profEmail = profEmail;
		this.mobileNumber = mobileNumber;
		this.exprc = exprc;
	}
	public ProfessorBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProfessorBean [profId=" + profId + ", profFirstName=" + profFirstName + ", profLastName=" + profLastName
				+ ", profPassYear=" + profPassYear + ", genderType=" + genderType + ", profEmail=" + profEmail
				+ ", mobileNumber=" + mobileNumber + ", exprc=" + exprc + "]";
	}
	public int getProfId() {
		return profId;
	}
	public void setProfId(int profId) {
		this.profId = profId;
	}
	public String getProfFirstName() {
		return profFirstName;
	}
	public void setProfFirstName(String profFirstName) {
		this.profFirstName = profFirstName;
	}
	public String getProfLastName() {
		return profLastName;
	}
	public void setProfLastName(String profLastName) {
		this.profLastName = profLastName;
	}
	public int getProfPassYear() {
		return profPassYear;
	}
	public void setProfPassYear(int profPassYear) {
		this.profPassYear = profPassYear;
	}
	public String getGenderType() {
		return genderType;
	}
	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}
	public String getProfEmail() {
		return profEmail;
	}
	public void setProfEmail(String profEmail) {
		this.profEmail = profEmail;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getExprc() {
		return exprc;
	}
	public void setExprc(int exprc) {
		this.exprc = exprc;
	}
	
	
	
}
