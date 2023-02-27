package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.model.Department;
import com.model.Employee;
import com.service.DevelopmentServiecImpl;

public class HashSetDemo {

	public static void main(String[] args) {
		// InterfacecVar =new Imp();
		Set<Employee> hashSet = new HashSet<Employee>();

		Employee employee1 = new Employee(10, "Hari", 25, 30000f);
		Employee employee2 = new Employee(11, "Venky", 24, 31000f);
		Employee employee3 = new Employee(12, "giri", 25, 31000f);
		Employee employee4 = new Employee(13, "Hari", 30, 31000f);

		hashSet.add(employee1);
		hashSet.add(employee2);
		hashSet.add(employee3);
		hashSet.add(employee4);

		for (Employee employee : hashSet) {
			System.out.println(employee.getEmpName() + " " + employee.getAge());

		}

		System.out.println("after sort :");

		Set<Employee> treeSet = new TreeSet<Employee>();

		treeSet.add(employee1);
		treeSet.add(employee2);
		treeSet.add(employee3);
		treeSet.add(employee4);

		for (Employee employee : treeSet) {
			System.out.println(employee.getEmpName() + " " + employee.getAge());

		}
		System.out.println();

		List<Employee> listSet = new ArrayList<Employee>();
		listSet.add(employee1);
		listSet.add(employee2);
		listSet.add(employee3);
		listSet.add(employee4);
		Collections.sort(listSet); // sorts according to pojofile of employee

		for (Employee employee : listSet) {
			System.out.println(employee.getEmpName() + " " + employee.getAge());
		}

		Department department = new Department(10, "ece");
		department.setEmployees(listSet);
		DevelopmentServiecImpl developmentServiecImpl = new DevelopmentServiecImpl();
		Set<Employee> set = developmentServiecImpl.searchEmployeeByName(department, "Hari");

		for (Employee employee : set) {
			System.out.println("after search emp name is     : " + employee.getEmpName());
			System.out.println("after search emp Number is   : " + employee.getEmpNo());
		}

	}

}
