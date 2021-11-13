package com.java.inquries.beans;

public class CourseBean {
	private int courseId;
	private String courseName;
	private double courseFees;
	private String courseDetails;
	public CourseBean(int courseId, String courseName, double courseFees, String courseDetails) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFees = courseFees;
		this.courseDetails = courseDetails;
	}
	
	
	public CourseBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "CourseBean [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees
				+ ", courseDetails=" + courseDetails + "]";
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public double getCourseFees() {
		return courseFees;
	}


	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}


	public String getCourseDetails() {
		return courseDetails;
	}


	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}
	
	
	
	
	
}
