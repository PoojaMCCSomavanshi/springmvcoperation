package com.java.spring.mvc.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.spring.mvc.beans.Course;
import com.java.spring.mvc.beans.Student;

@Controller
@RequestMapping(value = "student/")
public class StudentController {
	static {
		System.out.println("Inside studentController...");
	}
	
	public static List<Student> studList = new ArrayList<Student>();	// u are going to implement it inside hibernate..

	@RequestMapping(value = "registerpage/", method = RequestMethod.GET)
	public ModelAndView addStudent() {
		HashMap<String,Object> studentModel = new HashMap<String, Object>();
		studentModel.put("studBean",new Student());
		studentModel.put("courseList",prepareCourseDropdown());
		studentModel.put("skills",prepareHobbies());
		
		return new ModelAndView("registerStudent",studentModel);
	}
	
	@RequestMapping(value = "save/", method = RequestMethod.POST)
	public ModelAndView saveStudentRecord(@ModelAttribute("studBean") Student studBean) {
		System.out.println("StudentRecord -->" + studBean);
		studList.add(studBean);
		
		HashMap<String,Object> studentModel = new HashMap<String, Object>();
		studentModel.put("studBean",new Student());
		studentModel.put("courseList",prepareCourseDropdown());
		studentModel.put("skills",prepareHobbies());
		studentModel.put("message","Student Record Saved Successfully...!");
		return new ModelAndView("registerStudent",studentModel);
	}

	
	protected Map<Integer,String> prepareCourseDropdown() {
	    Map<Integer,String> courseMap = new LinkedHashMap<Integer,String>();
	    for (Course cr : CourseController.courses) {
	    	courseMap.put(cr.getCourseId(),cr.getCourseName());
		}
	    return courseMap;
	}

	public List<String> prepareHobbies(){
		 	List<String> skill = new ArrayList<String>();
	        skill.add("Hibernate");
	        skill.add("Spring");
	        skill.add("Struts");
	        skill.add("Groovy");
	        skill.add("Grails");
	        return skill;
	}
	
}
