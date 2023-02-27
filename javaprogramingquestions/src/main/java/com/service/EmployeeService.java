package com.service;

import com.exception.UserException;
import com.model.Employee;

public interface EmployeeService {
public abstract void readAllEmployees(Employee[] employees);
public abstract Employee searchEmployeeByI(Employee[] employees,int empId)throws UserException;
public abstract Employee[] displayEmployeeByGender(Employee[] employees,int empId) throws UserException;
public abstract Employee[] displayEmployeeByGenderAndDepartmeet(Employee[] employees,int empId,String department) throws UserException;

}
