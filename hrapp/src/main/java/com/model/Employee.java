package com.model;

public class Employee {
	private int empId;
	private String empName;
	private char gender;
	private float salary;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, char gender, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.salary = salary;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
