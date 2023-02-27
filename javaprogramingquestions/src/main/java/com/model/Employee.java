package com.model;

public class Employee {
	private int empId;
	private String empName;
	private String deptName;
	private String gender;
	private int joiningYear;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String deptName, String gender, int joiningYear) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
		this.gender = gender;
		this.joiningYear = joiningYear;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

}
