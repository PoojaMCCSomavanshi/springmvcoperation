package com.java.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.spring.mvc.dao.CourseDaoImpl;

@Service
public class CourseServiceImpl {
		static {
			System.out.println("Inside CourseServiceImpl...");
		}
		
		
	@Autowired
	public CourseDaoImpl daoImpl;
}
