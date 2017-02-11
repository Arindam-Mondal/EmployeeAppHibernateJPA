package com.howtodoinjava.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.dao.EmployeeDAO;
import com.howtodoinjava.demo.model.DepartmentEntity;

@Service
public class DepartmentManagerImpl implements DepartmentManager{
	
	@Autowired
	EmployeeDAO dao;
	
	public DepartmentEntity getDepartmentById(Integer id) {
		
		System.out.println("Inside DepartmentEntity "+id);
		
		return dao.getDepartmentById(id);
	}

}
