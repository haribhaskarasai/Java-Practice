package com.service;

import java.util.List;
import java.util.Set;

import com.model.Department;

public interface DevelopmentService {
public abstract Set searchEmployeeByName(Department department,String empName);
}
