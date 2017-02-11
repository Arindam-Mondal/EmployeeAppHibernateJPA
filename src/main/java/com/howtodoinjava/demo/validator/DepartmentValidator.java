package com.howtodoinjava.demo.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.howtodoinjava.demo.model.DepartmentEntity;
import com.howtodoinjava.demo.service.DepartmentManager;

@Component
public class DepartmentValidator {
	
	@Autowired
	DepartmentManager deptManager;
	
	public DepartmentEntity validateDepartmentById(int id){
		
		DepartmentEntity d = deptManager.getDepartmentById(id);
		return d;
	}

}
