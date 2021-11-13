package com.java.inquries.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.inquries.dao.StudentDao;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	public SessionFactory sfactory;
	static {
		System.out.println("StudentDaoImpl loaded..");
	}
}
