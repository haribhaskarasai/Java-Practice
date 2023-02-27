package com.foreach;

import java.util.ArrayList;
import java.util.List;



public class ForEachMain {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "hari", 20000.20f));
		employees.add(new Employee(20, "venky", 30000.20f));
		employees.add(new Employee(30, "giri", 40000.20f));

		employees.forEach((employee) -> {
			System.out.println(employee.getEmpNo());
			System.out.println(employee.getEmpName());

		});
		employees.forEach(System.out::println);

	}

}
