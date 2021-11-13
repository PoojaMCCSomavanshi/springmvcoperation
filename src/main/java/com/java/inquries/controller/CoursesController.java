package com.java.inquries.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.inquries.beans.CourseBean;
//13
//studentController --------> 4
//professorController --------> 4
//CourseController -----------> 4
// /               -----------> http://localhost:8080/inquiries/ --> spring--> index.html/htm/.jsp
// ------------------------------------
   //13


@Controller
@RequestMapping("/courses")
public class CoursesController {
	
	static {
		System.out.println("CoursesController --> Loaded..");
	}
	
	@RequestMapping(value = "/")	//http://localhost:8080/inquiries/student/
	public ModelAndView courseWelcomePage() {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("cbean",new CourseBean());
		return new ModelAndView("course",model);
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)	//http://localhost:8080/inquiries/student/save
	public ModelAndView addOrUpdateCourse(@ModelAttribute("cbean") CourseBean bean) {
		System.out.println("here is the entered data --> "+bean);
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("cbean",new CourseBean());
		return new ModelAndView("course",model);
	}
	
	@RequestMapping(value = "/delete")	//http://localhost:8080/inquiries/course/save
	public void deleteCourseRecord() {
		
	}
	
	@RequestMapping(value = "/edit/{stid}")//http://localhost:8080/inquiries/course/edit/101
	public void fetchRecordForUpdate() {
		
	}
}
