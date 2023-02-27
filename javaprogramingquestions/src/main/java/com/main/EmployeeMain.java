package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.model.Employee;

public class EmployeeMain {
	private static final Logger LOGGER = LogManager.getLogger(EmployeeMain.class);

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Employee> employees=new ArrayList<Employee>();
		while(true) {
			System.out.println("1. Add");
			System.out.println("2. View");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			Employee employee=new Employee();
			
			
			System.out.println("Enter Employee Id : ");
			employee.setEmpId(scanner.nextInt());
			LOGGER.info("Entered Employee Id is : "+employee.getEmpId());
			
			System.out.println("Enter Employee Name : ");
			employee.setEmpName(scanner.next());
			LOGGER.info("Entered Employee Name is : "+employee.getEmpName());
			
			System.out.println("Enter Employee Department Name : ");
			employee.setDeptName(scanner.next());
			LOGGER.info("Entered Employee Name Department is : "+employee.getDeptName());
			employees.add(employee);
			break;
		case 2:
			for (Employee employee1 : employees) {
				System.out.println(employee1.getEmpId());
				System.out.println(employee1.getEmpName());
				System.out.println(employee1.getDeptName());
				System.out.println("-----------------------------------");
			}
			
			break;
		default:
			break;
		}
		}
//		Employee employee=new Employee();
//		
//		
//		System.out.println("Enter Employee Id : ");
//		employee.setEmpId(scanner.nextInt());
//		LOGGER.info("Entered Employee Id is : "+employee.getEmpId());
//		
//		System.out.println("Enter Employee Name : ");
//		employee.setEmpName(scanner.next());
//		LOGGER.info("Entered Employee Name is : "+employee.getEmpName());
//		
//		System.out.println("Enter Employee Department Name : ");
//		employee.setDeptName(scanner.next());
//		LOGGER.info("Entered Employee Name Department is : "+employee.getDeptName());
	}
}
