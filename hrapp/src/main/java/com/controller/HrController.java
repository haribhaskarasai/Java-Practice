package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;
import com.model.Employee;

@RestController
public class HrController {
	@RequestMapping(value = "getdepartment", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, method = RequestMethod.GET)
	public Department getDepartment() {
		Employee employee1 = new Employee(10, "Hari", 'M', 1500);
		Employee employee2 = new Employee(11, "Gari", 'M', 1500);
		Employee employee3 = new Employee(13, "HGari", 'M', 1500);
		Employee employee4 = new Employee(14, "GHari", 'M', 1500);

		Department department1 = new Department();
		department1.setDapName("Devop");
		department1.setDeptId(100);
		department1.setLocation("Chennai");

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		department1.setEmployees(employees);
		return department1;
	}
	//http://localhost:9090/projectname/search/10
	@RequestMapping(value="/search/{alias}", method=RequestMethod.GET)
	public Employee searchByEmployeeId(@PathVariable ("alias") int empId) {
		Employee employee=null;
		if(empId==10) {
			employee=new Employee(10,"hari",'m',5000);
		}
		if(empId==11) {
			employee=new Employee(11,"hari",'m',5000);
		}
		if(empId==12) {
			employee=new Employee(12,"hari",'m',5000);
		}
		if(empId==13) {
			employee=new Employee(13,"hari",'m',5000);
		}
		return employee;
	}
	@GetMapping(value="/search/{alias1}/{alias2}")
	public Employee searchByEmployeeIdAndName(@PathVariable ("alias1") int empId,@PathVariable ("alias2") String empName) {
		Employee employee=null;
		if(empId==10 && empName.equals("Hari")) {
			employee=new Employee(10,"hari",'m',5000);
		}
		if(empId==11 && empName.equals("Gari")){
			employee=new Employee(11,"hari",'m',5000);
		}
		if(empId==12 && empName.equals("HGari")) {
			employee=new Employee(12,"hari",'m',5000);
		}
		if(empId==13 && empName.equals("GHari")) {
			employee=new Employee(13,"hari",'m',5000);
		}
		return employee;
	}
	//@RequestMapping(value = "/create",method = RequestMethod.POST)
	@PostMapping(value = "/create")
	public Department createDepartment(@RequestBody Department department) {
		System.out.println("Department id : "+department.getDeptId());
		System.out.println("Department Name : " +department.getDapName());
		List<Employee> employees=department.getEmployees();
		employees.forEach((emp)->{
			System.out.println("Employee id : "+emp.getEmpId());
			System.out.println("Employee neme : "+emp.getEmpName());
			System.out.println("Employee gender: "+emp.getGender());
			System.out.println("Employee salary : "+emp.getSalary());
			
		});
		department.setDapName("processed"+department.getDapName());
		return department;
	}
	
	@PutMapping(value = "/updatedept/{depName}")
	public Department updateDepartmentName(@PathVariable String depName) {
		Department department1 = new Department();
		department1.setDapName(depName);
		department1.setDeptId(123);
		department1.setLocation("Chennai");
		return department1;
		
	}
	@PutMapping(value = "/updateemp/{depName}")
	public Department updateDepartmentName(@RequestBody Employee employee,@PathVariable String depName) {
		Department department1 = new Department();
		department1.setDapName(depName);
		department1.setDeptId(123);
		department1.setLocation("AP");
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(employee);
		department1.setEmployees(employees);
		return department1;
		
	}
}
