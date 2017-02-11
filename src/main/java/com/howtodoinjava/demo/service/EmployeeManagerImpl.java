package com.howtodoinjava.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.dao.EmployeeDAO;
import com.howtodoinjava.demo.model.DepartmentEntity;
import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.utility.SendMailUtility;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	public List<EmployeeEntity> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public List<DepartmentEntity> getAllDepartments() {
		return dao.getAllDepartments();
	}

	public void addEmployee(EmployeeEntity employee) {
		dao.addEmployee(employee);
	}

	public boolean deleteEmployee(Integer id) {
		if(dao.deleteEmployee(id)){
			SendMailUtility smu = new SendMailUtility();
			smu.sendMail("ariron123@gmail.com", "ariron123@gmail.com", "Employee Deleted Successfully", "Employee with id "+id+" deleted successfully");
			return true;
		}
		
		return false;
	}
}
