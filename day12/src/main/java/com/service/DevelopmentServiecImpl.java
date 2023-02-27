package com.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.model.Department;
import com.model.Employee;

public class DevelopmentServiecImpl implements DevelopmentService{

	@Override
	public Set searchEmployeeByName(Department department, String empName) {
		Set<Employee> set=new HashSet<Employee>();
		List<Employee> employees=department.getEmployees();
		for (Employee employee : employees) {
			if(employee.getEmpName().equals(empName)) {
				
				set.add(employee);
			}
			
		}
		
		return set;
	}

}
