package com.java.spring.mvc.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "COURSE_MASTER")
public class CourseEntity {
	@Id
	private int courseId;
	private String courseName;
	private double courseFees;
	private String courseDetails;
	
	private boolean active;
    private String createdBy;
    private String updatedBy;
    @CreationTimestamp
    private LocalDateTime createdOn;
    @UpdateTimestamp
    private LocalDateTime updatedOn;
	public CourseEntity(int courseId, String courseName, double courseFees, String courseDetails, boolean active) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFees = courseFees;
		this.courseDetails = courseDetails;
		this.active = active;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	public CourseEntity() {
		super();
	}
    
    
    
    
}
