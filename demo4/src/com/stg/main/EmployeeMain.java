package com.stg.main;

import com.stg.model.Employee;
import com.stg.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmpId(1234);
		employee1.setEmpName("Hari");
		employee1.setSalary(30000);

		Employee employee2 = new Employee();
		employee2.setEmpId(123);
		employee2.setEmpName("Venky");
		employee2.setSalary(35000);

		Employee employee3 = new Employee();
		employee3.setEmpId(123);
		employee3.setEmpName("Sai");
		employee3.setSalary(45000);

		Employee[] employees = new Employee[3];
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		EmployeeService employeeService = new EmployeeService();
		String ans = employeeService.employeeNameGreterThan5Characters(employee1);
		System.out.println(ans);

		Employee data = employeeService.salaryDifference(employee1, employee2);
		System.out.println(data.getEmpName());

		float total = employeeService.budget(employees);
		System.out.println(total);

		System.out.println();
		Employee highestSalaryEmployee = employeeService.highestSalaryEmployee(employees);
		System.out.println("Highest salary employee is : " + highestSalaryEmployee.getEmpName());

		System.out.println();
		System.out.println("Employees salary before Hike is : ");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getEmpName() + " : " + employees[i].getSalary());

		}

		System.out.println();
		employees = employeeService.employeeSalariesWithHike(employees);
		System.out.println("Employees salary after Hike is : ");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getEmpName() + " : " + employees[i].getSalary());

		}

	}

}
