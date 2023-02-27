package com.fidemo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "hari", 20000.20f));
		employees.add(new Employee(20, "venky", 30000.20f));
		employees.add(new Employee(30, "giri", 40000.20f));

		EmployeeInterface employeeInterface = (List<Employee> arg1, int arg2) -> {
			Employee tempEmp = null;
			for (Employee employee : employees) {
				if (employee.getEmpNo() == arg2) {
					tempEmp = employee;

				} else {
					// failure
				}

			}

			return tempEmp;

		};
		Employee outPut = employeeInterface.searchEmployeeById(employees, 400);
		if (outPut != null) {
			System.out.println(outPut.getEmpNo());
			System.out.println(outPut.getEmpName());
		} else {
			System.out.println("no such employee");
		}
	}

}
