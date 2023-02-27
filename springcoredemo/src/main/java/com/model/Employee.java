package com.model;

// pojo ==spring ==Bean==configuration file==<filename>.xml
public class Employee {
	private int empNo;
	private String empName;
	private float salary;

	public Employee() {
		super();
		System.out.println("Employee Constructor");
	}

	public Employee(int empNo) {
		super();
		System.out.println("1 para Constructor");
		this.empNo = empNo;
	}

	public Employee(int empNo, String empName) {
		super();
		System.out.println("2 para Constructor");
		this.empNo = empNo;
		this.empName = empName;
	}

	public Employee(int empNo, String empName, float salary) {
		super();
		System.out.println("3 para  Constructor");
		this.empNo = empNo;
		this.empName = empName;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
