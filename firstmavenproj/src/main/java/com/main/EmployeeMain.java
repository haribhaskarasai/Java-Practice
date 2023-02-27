package com.main;

import com.model.ContractEmployee;
import com.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// Employee employee = new Employee();

		ContractEmployee contractEmployee = new ContractEmployee();
		System.out.println(contractEmployee.getEmpNo());

		contractEmployee = null;
	}

}
