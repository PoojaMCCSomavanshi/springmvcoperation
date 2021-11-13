package com.java.spring.mvc.beans;

import java.util.List;

public class Student {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String studAddress;
			private String studentGender;		//Radio
	private long contactNumber;
			private List<Integer> selectedCourses;	//M-Dropdown
	private String username;
	private String password;
	private String cpassword;
	private List<String> selectHobbies;	//M-Checkbox
	public Student(int studentId, String studentName, String studentEmail, String studAddress, String studentGender,
			long contactNumber, List<Integer> selectedCourses, String username, String password, String cpassword,
			List<String> selectHobbies) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studAddress = studAddress;
		this.studentGender = studentGender;
		this.contactNumber = contactNumber;
		this.selectedCourses = selectedCourses;
		this.username = username;
		this.password = password;
		this.cpassword = cpassword;
		this.selectHobbies = selectHobbies;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studAddress=" + studAddress + ", studentGender=" + studentGender + ", contactNumber="
				+ contactNumber + ", selectedCourses=" + selectedCourses + ", username=" + username + ", password="
				+ password + ", cpassword=" + cpassword + ", selectHobbies=" + selectHobbies + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public List<Integer> getSelectedCourses() {
		return selectedCourses;
	}
	public void setSelectedCourses(List<Integer> selectedCourses) {
		this.selectedCourses = selectedCourses;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public List<String> getSelectHobbies() {
		return selectHobbies;
	}
	public void setSelectHobbies(List<String> selectHobbies) {
		this.selectHobbies = selectHobbies;
	}

	
	
}
