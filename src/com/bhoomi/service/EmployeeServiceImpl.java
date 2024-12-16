package com.bhoomi.service;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhoomi.dao.EmployeeDao;
import com.bhoomi.dao.EmployeeDaoImpl;
import com.bhoomi.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> employeesList() {
		List<Employee> empList=employeeDao.getEmployeeList();
		return empList;
	}

	@Override
	public int addNewEmployeeRecord(HttpServletRequest request, HttpServletResponse response) {
		int count=0;
		try {
			Employee employee = new Employee();

			employee.setEmpName(request.getParameter("empName"));

			employee.setEmpJob(request.getParameter("empJob"));

			employee.setEmpSalary(Float.parseFloat(request.getParameter("empSalary")));

			employee.setEmpDeptNum(Integer.parseInt(request.getParameter("empDeptNum")));

			employee.setEmpGender(request.getParameter("empGender"));

			employee.setEmpAge(Integer.parseInt(request.getParameter("empAge")));

			 count=employeeDao.insertEmployeeRecord(employee);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	@Override
	public Employee getEmployeeRecord(HttpServletRequest request, HttpServletResponse response) {

		Employee employee = null;

		try {

			int empId = Integer.parseInt(request.getParameter("empId"));

			employee = employeeDao.getEmployeeById(empId);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employee;
	}

	@Override
	public boolean updateEmployeeRecord(HttpServletRequest request, HttpServletResponse response) {
		
		boolean updateFlag = false;
		try {

			Employee employee = new Employee();

			employee.setEmpId(Integer.parseInt(request.getParameter("empId")));

			employee.setEmpName(request.getParameter("empName"));

			employee.setEmpJob(request.getParameter("empJob"));

			employee.setEmpSalary(Float.parseFloat(request.getParameter("empSalary")));

			employee.setEmpDeptNum(Integer.parseInt(request.getParameter("empDeptNum")));

			employee.setEmpGender(request.getParameter("empGender"));

			employee.setEmpAge(Integer.parseInt(request.getParameter("empAge")));

			updateFlag = employeeDao.updateEmployeeRecord(employee);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return updateFlag;

	}
	

	@Override
	public int deleteEmployeeRecord(HttpServletRequest request, HttpServletResponse response) {

		int count = 0;
		try {

			int empId = Integer.parseInt(request.getParameter("empId"));

			count = employeeDao.deleteEmployeeRecordById(empId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}



}
