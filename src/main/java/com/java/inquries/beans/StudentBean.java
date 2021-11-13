package com.java.inquries.beans;

public class StudentBean {
	private int studId;
	private String studFirstName;
	private String studLastName;
	private int studPassYear;
	private String genderType;
	private String studEmail;
	private long mobileNumber;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudFirstName() {
		return studFirstName;
	}
	public void setStudFirstName(String studFirstName) {
		this.studFirstName = studFirstName;
	}
	public String getStudLastName() {
		return studLastName;
	}
	public void setStudLastName(String studLastName) {
		this.studLastName = studLastName;
	}
	public int getStudPassYear() {
		return studPassYear;
	}
	public void setStudPassYear(int studPassYear) {
		this.studPassYear = studPassYear;
	}
	public String getGenderType() {
		return genderType;
	}
	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}
	public String getStudEmail() {
		return studEmail;
	}
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public StudentBean(int studId, String studFirstName, String studLastName, int studPassYear, String genderType,
			String studEmail, long mobileNumber) {
		super();
		this.studId = studId;
		this.studFirstName = studFirstName;
		this.studLastName = studLastName;
		this.studPassYear = studPassYear;
		this.genderType = genderType;
		this.studEmail = studEmail;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "StudentBean [studId=" + studId + ", studFirstName=" + studFirstName + ", studLastName=" + studLastName
				+ ", studPassYear=" + studPassYear + ", genderType=" + genderType + ", studEmail=" + studEmail
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
