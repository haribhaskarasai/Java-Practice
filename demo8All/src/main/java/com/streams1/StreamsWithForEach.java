package com.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.foreach.Employee;

public class StreamsWithForEach {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "hari", 20000.20f));
		employees.add(new Employee(20, "venky", 30000.20f));
		employees.add(new Employee(30, "giri", 40000.20f));

		employees.stream().forEach((a) -> {
			System.out.println(a.getEmpName());
			System.out.println(a.getEmpName());
			System.out.println(a.getSalary());
		});
		long employeeAbove30000 = employees.stream().filter((a) -> a.getSalary() > 30000).count();
		System.out.println("Employees whose salary is more than 300000 : " + employeeAbove30000);

		long employeecontainsa = employees.stream().filter((b) -> b.getEmpName().contains("a")).count();
		System.out.println("Employees whose salary is more than 300000 : " + employeecontainsa);

		List<Employee> newList = employees.stream().filter((a) -> a.getSalary() > 30000)
				.filter((b) -> b.getEmpName().contains("i")).collect(Collectors.toList());
		for (Employee employee : newList) {
			System.out.println(employee.getEmpName());
		}

	}

}
