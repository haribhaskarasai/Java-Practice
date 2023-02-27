package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class Demo1 {

	public static void main(String[] args) {
		// load xml file(configuration file) by container i.e ApplycationContext
		// interface var= new Implementation

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/springconfig.xml");

		Employee employee1 = (Employee) applicationContext.getBean("employee");
		employee1.setEmpNo(123);
		employee1.setEmpName("Hari");
		employee1.setSalary(30000);
		System.out.println(employee1.getEmpNo());
		System.out.println(employee1.getEmpName());
		System.out.println(employee1.getSalary());

		Employee employee2 = (Employee) applicationContext.getBean("employee");
		System.out.println(employee2.getEmpNo());
		System.out.println(employee2.getEmpName());
		System.out.println(employee2.getSalary());

		Employee employee3 = (Employee) applicationContext.getBean("employee1");

		Employee employee4 = (Employee) applicationContext.getBean("employee2");

		Employee employee5 = (Employee) applicationContext.getBean("employee3");
		System.out.println("The end");
	}

}
