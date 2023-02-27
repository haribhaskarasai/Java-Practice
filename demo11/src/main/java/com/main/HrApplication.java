package com.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.Department;
import com.model.Employee;
import com.service.DepartmentService;
import com.service.DepartmentServiceImp;
import com.service.EmployeeService;
import com.service.EmployeeServiceImp;

public class HrApplication {

	public static void main(String[] args) {
		Employee employee1 = new Employee(10, "Ten", 'M', 25);
		Employee employee2 = new Employee(20, "Twenty", 'M', 25);
		Employee employee3 = new Employee(30, "Thirty", 'M', 25);

		Department department1 = new Department(10, "Development");
		Department department2 = new Department(20, "Testing");
		int[] intArray = new int[3];// array is homogeneous collection

		// crearting a collection --- dynamic memory //collection is heterogeneous
		// collection

		Set set = new HashSet();
		set.add(employee2);
		set.add(employee3);
		set.add(employee1);
		set.add(department1);
		set.add(department2);

		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee new_name = (Employee) object;
				System.out.println(new_name.getEmpNo());
			}
			if (object instanceof Department) {
				Department department = (Department) object;
				System.out.println(department.getDepNo());
			}

		}

		System.out.println();

		System.out.println("size of collection " + set.size());
		// iteraface var=new Imp();==abstract
		EmployeeService employeeService = new EmployeeServiceImp();
		Employee result = employeeService.searchEmployeeByNo(set, 20);
		System.out.println("Empolyee number : " + result.getEmpNo());
		System.out.println("Empolyee name   : " + result.getEmpName());

		System.out.println();

		Set result2 = employeeService.searchEmployeeByName(set, "Thirty");
		// Iterate
		for (Iterator iterator = result2.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee new_name = (Employee) object;
				System.out.println("Empolyee number : " + new_name.getEmpNo());
				System.out.println("Empolyee name   : " + new_name.getEmpName());
			}

		}

		System.out.println();

		Set result3 = employeeService.searchEmployeeByAge(set, 25);
		// Iterate
		for (Iterator iterator = result3.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee new_name = (Employee) object;
				System.out.println("Empolyee number : " + new_name.getEmpNo());
				System.out.println("Empolyee name   : " + new_name.getEmpName());
			}

		}

		System.out.println();

		Set result4 = employeeService.searchEmployeeByGender(set, 'M');
		// Iterate
		for (Iterator iterator = result4.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee new_name = (Employee) object;
				System.out.println("Empolyee number : " + new_name.getEmpNo());
				System.out.println("Empolyee name   : " + new_name.getEmpName());
			}

		}

		System.out.println();

		DepartmentService departmentService = new DepartmentServiceImp();
		Department result5 = departmentService.searchDepartmentByNo(set, 10);
		System.out.println("Department number : " + result5.getDepNo());
		System.out.println("Department name   : " + result5.getDepName());

		System.out.println();

		Set result6 = departmentService.searchDepartmentByName(set, "Testing");
		for (Iterator iterator = result6.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Department) {
				Department department = (Department) object;
				System.out.println("Department number : " + department.getDepNo());
				System.out.println("Department name   : " + department.getDepName());

			}

		}

	}

}
