package com.java.inquries.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.inquries.beans.ProfessorBean;
import com.java.inquries.beans.ProfessorBean;

@Controller
@RequestMapping("/prof")
public class ProfessorsController {

	
	static {
		System.out.println("ProfessorsController --> Loaded..");
	}
	
	@RequestMapping(value = "/")	//http://localhost:8080/inquiries/professor/
	public ModelAndView professorWelcomePage() {
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("pbean",new ProfessorBean());
		return new ModelAndView("prof",model);
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)	//http://localhost:8080/inquiries/prof/save
	public ModelAndView addOrUpdateProfessor(@ModelAttribute("pbean") ProfessorBean bean) {
		System.out.println("here is the entered data --> "+bean);
		HashMap<String,Object> model = new HashMap<String, Object>();
		model.put("pbean",new ProfessorBean());
		return new ModelAndView("prof",model);
	}
	
	@RequestMapping(value = "/delete")	//http://localhost:8080/inquiries/prof/save
	public void deleteProfessorRecord() {
		
	}
	
	@RequestMapping(value = "/edit/{stid}")//http://localhost:8080/inquiries/prof/edit/101
	public void fetchRecordForUpdate() {
		
	}
}
