package com.service;

import java.util.Iterator;
import java.util.Set;

import com.model.Employee;

public interface EmployeeService {
	
    public	abstract Employee searchEmployeeByNo(Set set,int empNo);
    public	abstract Set searchEmployeeByName(Set set,String empName);
    public	abstract Set searchEmployeeByAge(Set set,int age);
    public	abstract Set searchEmployeeByGender(Set set,char gender);
    
	
	
}
