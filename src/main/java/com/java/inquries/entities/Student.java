package com.java.inquries.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class Student {

	@Id
	private int studId;
	private String studName;
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	
}
