package com.model;

public class Employee {
	private int empNo;
	private String empName;
	private char gender;
	private int age;

	public Employee() {
		super();
	}

	public Employee(int empNo, String empName, char gender, int age) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.gender = gender;
		this.age = age;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
