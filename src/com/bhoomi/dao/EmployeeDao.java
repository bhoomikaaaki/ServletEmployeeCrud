package com.bhoomi.dao;

import java.util.List;

import com.bhoomi.model.Employee;

public interface EmployeeDao {
	
	public List<Employee> getEmployeeList();
	
	public int insertEmployeeRecord(Employee employee);
	
	public Employee getEmployeeById(int empId);
	
	public boolean updateEmployeeRecord(Employee employee);
	
	public int deleteEmployeeRecordById(int emoId);

}
