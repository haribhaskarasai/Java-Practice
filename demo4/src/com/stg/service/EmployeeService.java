package com.stg.service;

import com.stg.model.Employee;

public class EmployeeService {
	public String employeeNameGreterThan5Characters(Employee employee) {
		String temp = "";
		if (employee.getEmpName().length() > 5) {
			temp = "Success";
		} else {
			temp = "Fail";
		}

		return temp;
	}

	public Employee salaryDifference(Employee employee1, Employee employee2) {
		Employee employee = null;
		if (employee1.getSalary() > employee2.getSalary()) {
			employee = employee1;
		} else {
			employee = employee2;
		}
		return employee;
	}

	public float budget(Employee[] employees) {
		float totalSalary = 0;
		for (int i = 0; i < employees.length; i++) {
			totalSalary += employees[i].getSalary();
		}
		return totalSalary;
	}

	public Employee highestSalaryEmployee(Employee[] employees) {
		float highSalary = 0;
		int tempIndex = 0;
		for (int i = 0; i < employees.length; i++) {
			if (highSalary < employees[i].getSalary()) {
				highSalary = employees[i].getSalary();
				tempIndex = i;
			}

		}
		return employees[tempIndex];
	}

	public Employee[] employeeSalariesWithHike(Employee[] employees) {
		for (int i = 0; i < employees.length; i++) {
			employees[i].setSalary(employees[i].getSalary() + 500);

		}
		return employees;
	}

}
