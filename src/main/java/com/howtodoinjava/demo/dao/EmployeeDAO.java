package com.howtodoinjava.demo.dao;

import java.util.List;

import com.howtodoinjava.demo.model.DepartmentEntity;
import com.howtodoinjava.demo.model.EmployeeEntity;

public interface EmployeeDAO 
{
	public List<EmployeeEntity> getAllEmployees();
	public List<DepartmentEntity> getAllDepartments();
	public void addEmployee(EmployeeEntity employee);
	public DepartmentEntity getDepartmentById(Integer id);
	public boolean deleteEmployee(Integer id);
}