package com.bhoomi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bhoomi.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

	private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/prod?useSSL=false";

	private static final String USER_ID = "root";

	private static final String USER_PASSORD = "root";
	
	private static final String GET_ALL_EMPLOYEES="Select * from employee";
	
	private static final String GET_EMPLOYEE_BYEMPID_QUERY = "SELECT emp_id, emp_name, emp_job, emp_salary, emp_dept_number, emp_gender,emp_age FROM EMPLOYEE where  emp_id = ?";

	private static final String UPDATE_EMPLOYEE_RECORD_QUERY = "UPDATE EMPLOYEE SET emp_name = ?, emp_job=?, emp_salary=?, emp_dept_number=?, emp_gender=?,emp_age=? WHERE emp_id=?";

	private static final String ADD_NEW_EMPLOYEE_QUERY = "insert into employee(emp_name,emp_job,emp_salary,emp_dept_number,emp_gender,emp_age) values(?,?,?,?,?,?)";

	private static final String DELETE_EMPLOYEE_RECORD_QUERY = "DELETE FROM EMPLOYEE WHERE emp_id = ? ";

	
	public Connection getConnection() {

		Connection connection = null;

		try {

			Class.forName(DB_DRIVER_CLASS);

			connection = DriverManager.getConnection(CONNECTION_URL, USER_ID, USER_PASSORD);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

	@Override
	public List<Employee> getEmployeeList() {
		
		List<Employee> empList=new ArrayList<>();
		
		try {
			Connection conn=getConnection();
			
			PreparedStatement preparedStatement=conn.prepareStatement(GET_ALL_EMPLOYEES);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while (resultSet.next()) {

				Employee employee = new Employee();

				employee.setEmpId(resultSet.getInt(1));

				employee.setEmpName(resultSet.getString(2));

				employee.setEmpJob(resultSet.getString(3));

				employee.setEmpSalary(resultSet.getFloat(4));

				employee.setEmpDeptNum(resultSet.getInt(5));

				employee.setEmpGender(resultSet.getString(6));

				employee.setEmpAge(resultSet.getInt(7));

				empList.add(employee);

			
		} 
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public int insertEmployeeRecord(Employee employee) {
		int c=0;
		
		try {
			Connection conn=getConnection();
			
			PreparedStatement prepareStatement=conn.prepareStatement(ADD_NEW_EMPLOYEE_QUERY);
			
			prepareStatement.setString(1, employee.getEmpName());

			prepareStatement.setString(2, employee.getEmpJob());

			prepareStatement.setDouble(3, employee.getEmpSalary());

			prepareStatement.setInt(4, employee.getEmpDeptNum());

			prepareStatement.setString(5, employee.getEmpGender());

			prepareStatement.setInt(6, employee.getEmpAge());

			
			c=prepareStatement.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return c;
	}
	@Override
	public Employee getEmployeeById(int empId) {

		Employee employee = null;

		try (Connection connection = getConnection();) {

			PreparedStatement prepareStatement = connection.prepareStatement(GET_EMPLOYEE_BYEMPID_QUERY);

			prepareStatement.setInt(1, empId);

			ResultSet resultSet = prepareStatement.executeQuery();

			resultSet.next();

			employee = new Employee();

			employee.setEmpId(resultSet.getInt(1));

			employee.setEmpName(resultSet.getString(2));

			employee.setEmpJob(resultSet.getString(3));

			employee.setEmpSalary(resultSet.getFloat(4));

			employee.setEmpDeptNum(resultSet.getInt(5));

			employee.setEmpGender(resultSet.getString(6));

			employee.setEmpAge(resultSet.getInt(7));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employee;
	}

	@Override
	public boolean updateEmployeeRecord(Employee employee) {
		
		boolean updateFlag = false;

		try (Connection connection = getConnection();) {

			PreparedStatement prepareStatement = connection.prepareStatement(UPDATE_EMPLOYEE_RECORD_QUERY);

			prepareStatement.setString(1, employee.getEmpName());

			prepareStatement.setString(2, employee.getEmpJob());

			prepareStatement.setDouble(3, employee.getEmpSalary());

			prepareStatement.setInt(4, employee.getEmpDeptNum());

			prepareStatement.setString(5, employee.getEmpGender());

			prepareStatement.setInt(6, employee.getEmpAge());

			prepareStatement.setInt(7, employee.getEmpId());

			int count = prepareStatement.executeUpdate();

			if (count >= 1) {
				updateFlag = true;
			} else {
				updateFlag = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return updateFlag;


	}
	
	@Override
	public int deleteEmployeeRecordById(int empId) {

		int count = 0;

		try (Connection connection = getConnection();) {

			PreparedStatement prepareStatement = connection.prepareStatement(DELETE_EMPLOYEE_RECORD_QUERY);

			prepareStatement.setInt(1, empId);

			count = prepareStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}




}
