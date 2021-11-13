package com.java.inquries.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.inquries.beans.StudentBean;
import com.java.inquries.entities.Student;
import com.java.inquries.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	static List<StudentBean> studList = new ArrayList<StudentBean>();
	
	@Autowired
	private StudentService studentService;
	
	static {
		System.out.println("StudentController --> Loaded..");
	}
	
	
	@RequestMapping(value = "/")	//http://localhost:8080/inquiries/student/
	public ModelAndView studentWelcomePage() {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("sbean",new StudentBean());
		model.put("slist",studList); // page--empty list-
		return new ModelAndView("student",model);
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)	//http://localhost:8080/inquiries/student/save
	public ModelAndView addOrUpdateStudent(@ModelAttribute("sbean") StudentBean bean) {
		System.out.println("here is the entered data --> "+bean);
		// will call studentService chya save or update method
		String message = "";
		
		//validationParts ->
		if(bean!=null) {
				
			if(bean.getStudId()<=0) {
				message = "Invalid Student Id";
			}else if(bean.getStudPassYear()<2000) {
				message = "Invalid Passing Year...shud be >=2000";
			}else if(!(bean.getGenderType().equalsIgnoreCase("Male") || bean.getGenderType().equalsIgnoreCase("female"))) {
				message = "Invalid Gender Type";
			}else {
				boolean isStudentPresent = false;
					for (StudentBean stud : studList) {
						if(stud.getStudId() == bean.getStudId()) {
							stud.setMobileNumber(bean.getMobileNumber());
							stud.setStudEmail(bean.getStudEmail());
							stud.setStudLastName(bean.getStudLastName());
							stud.setStudPassYear(bean.getStudPassYear());
							message = "Student Record updated Successfully....!";
							isStudentPresent = true;
							break;
						}
					}
					
				if (!isStudentPresent) {
						studList.add(bean); // service.addNewStudent(bean) ---> service--. serviceImpl--Dao--DaoImpl
						message = "Student Record updated Successfully....!";
				}
			}
			
		}
		
		
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("sbean",new StudentBean()); //emptybean
		model.put("slist",studList);		//list of students
		model.put("result",message);
		
		return new ModelAndView("student",model);
	}
	
	@RequestMapping(value = "/delete/{sid}")	//http://localhost:8080/inquiries/student/save
	public ModelAndView deleteStudentRecord(@PathVariable("sid") int studId) {
		String message = "";
		for (StudentBean stud : studList) {
			if(stud.getStudId()==studId) {
				studList.remove(stud);
				message = "Student Record Deleted...!";
				break;
			}
		}
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("sbean",new StudentBean()); //emptybean
		model.put("slist",studList);		//list of students
		model.put("result",message);
		return new ModelAndView("student",model);
	}
	
	@RequestMapping(value = "/edit/{stid}")//http://localhost:8080/inquiries/student/edit/101
	public ModelAndView fetchRecordForUpdate(@PathVariable("stid") int stId) {
		StudentBean recordForEdit = null;
		
		for (StudentBean stud : studList) {
			if(stud.getStudId()==stId) {
				recordForEdit = stud;
				break;
			}
		}
		
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("sbean",recordForEdit); //emptybean
		model.put("slist",studList);		//list of students
		return new ModelAndView("student",model);	
	}
	
	
	
}
