package com.java.spring.mvc.beans;

public class Course {
	 private int courseId;
	 private String courseName;
	 private String courseDetails;
	 private double courseFees;
	public Course(int courseId, String courseName, String courseDetails, double courseFees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDetails = courseDetails;
		this.courseFees = courseFees;
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
	public String getCourseDetails() {
		return courseDetails;
	}
	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ",\n courseName=" + courseName + ",\n courseDetails=" + courseDetails
				+ ",\n courseFees=" + courseFees + "]";
	}
	
	
	 
	 
	 
}
