package com.stg.main;

import com.stg.model.Department;
import com.stg.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpNo(125);
		employee.setSalary(125.6f);
		employee.setAttendence(true);
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getSalary());
		System.out.println(employee.isAttendence());
		Department department = new Department();
		department.setDeptId(25);
		department.setDeptName("devepment");
		System.out.println(department.getDeptId());
		System.out.println(department.getDeptName());
	}

}
