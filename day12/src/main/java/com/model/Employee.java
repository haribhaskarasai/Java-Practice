package com.model;

public class Employee implements Comparable<Employee> {
	private int empNo;
	private String empName;
	private int age;
	private float salary;

	public Employee() {
		super();
	}

	public Employee(int empNo, String empName, int age, float salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	//comparing based on age
	@Override
	public int compareTo(Employee arg0) {
		if (this.age == arg0.age) {
			return 0;
		} else if (this.age >= arg0.age) {
			return 1;
		} else {
			return -1;
		}
		
	}

}
