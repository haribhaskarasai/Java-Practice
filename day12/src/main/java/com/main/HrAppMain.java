package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.Department;
import com.model.Employee;

public class HrAppMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee(10, "Hari", 25, 30000f);
		Employee employee2 = new Employee(11, "Venky", 25, 31000f);
		Employee employee3 = new Employee(12, "giri", 25, 31000f);
		Employee employee4 = new Employee(13, "balu", 25, 31000f);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee3);

		List<Employee> employees2 = new ArrayList<Employee>();
		employees2.add(employee2);
		employees2.add(employee4);

		Department department = new Department(123, "Development");
		department.setEmployees(employees); // one to many

		Department department2 = new Department(124, "Testing");
		department2.setEmployees(employees2);

		System.out.println(department.getDeptNo());
		System.out.println(department.getDeptName());
		List<Employee> coll = department.getEmployees();

		for (Employee employee : coll) {
			System.out.println(employee.getEmpName());

		}

		System.out.println();

		System.out.println(department2.getDeptNo());
		System.out.println(department2.getDeptName());
		List<Employee> coll2 = department2.getEmployees();

		for (Employee employee : coll2) {
			System.out.println(employee.getEmpName());

		}

	}

}
