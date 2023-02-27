package com.service;

import java.util.Set;

import com.model.Department;


public interface DepartmentService {
	public	abstract Department searchDepartmentByNo(Set set,int deptNo);
    public	abstract Set searchDepartmentByName(Set set,String deptName);
}
