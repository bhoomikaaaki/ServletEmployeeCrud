package com.bhoomi.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhoomi.model.Employee;

public interface EmployeeService {
	
	public List<Employee> employeesList();
	
	public int addNewEmployeeRecord(HttpServletRequest request,HttpServletResponse response);
	
	public Employee getEmployeeRecord(HttpServletRequest request,HttpServletResponse response);
	
	public boolean updateEmployeeRecord(HttpServletRequest request,HttpServletResponse response);
	
	public int deleteEmployeeRecord(HttpServletRequest request,HttpServletResponse response);

}
