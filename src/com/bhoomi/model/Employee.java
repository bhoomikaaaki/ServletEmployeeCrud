package com.bhoomi.model;

public class Employee {
	
	private int empId;

	private String empName;

	private String empJob;

	private double empSalary;

	private int empDeptNum;

	private String empGender;

	private int empAge;

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empJob
	 */
	public String getEmpJob() {
		return empJob;
	}

	/**
	 * @param empJob
	 *            the empJob to set
	 */
	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}

	/**
	 * @return the empSalary
	 */
	public double getEmpSalary() {
		return empSalary;
	}

	/**
	 * @param empSalary
	 *            the empSalary to set
	 */
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	/**
	 * @return the empDeptNum
	 */
	public int getEmpDeptNum() {
		return empDeptNum;
	}

	/**
	 * @param empDeptNum
	 *            the empDeptNum to set
	 */
	public void setEmpDeptNum(int empDeptNum) {
		this.empDeptNum = empDeptNum;
	}

	/**
	 * @return the empGender
	 */
	public String getEmpGender() {
		return empGender;
	}

	/**
	 * @param empGender
	 *            the empGender to set
	 */
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	/**
	 * @return the empAge
	 */
	public int getEmpAge() {
		return empAge;
	}

	/**
	 * @param empAge
	 *            the empAge to set
	 */
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empJob=" + empJob + ", empSalary=" + empSalary
				+ ", empDeptNum=" + empDeptNum + ", empGender=" + empGender + ", empAge=" + empAge + "]";
	}


}
