package com.java.inquries.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.inquries.dao.impl.StudentDaoImpl;
import com.java.inquries.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	public StudentDaoImpl dao;
	static {
		System.out.println("StudentServiceImpl loaded..");
	}
	
}
