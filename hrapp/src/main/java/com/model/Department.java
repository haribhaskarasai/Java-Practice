package com.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Department {
 private int deptId;
 private String dapName;
 private String location;
 private List<Employee> employees;
public Department() {
	super();
}
public Department(int deptId, String dapName, String location, List<Employee> employees) {
	super();
	this.deptId = deptId;
	this.dapName = dapName;
	this.location = location;
	this.employees = employees;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDapName() {
	return dapName;
}
public void setDapName(String dapName) {
	this.dapName = dapName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
 
}
