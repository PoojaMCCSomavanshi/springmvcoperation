package com.java.spring.mvc.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDaoImpl {
	static {
		System.out.println("Inside CourseDaoImpl...");
	}
	
	@Autowired
	public SessionFactory sessionfactory;
	
}
