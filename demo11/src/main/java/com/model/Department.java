package com.model;

public class Department {
	private int depNo;
	private String depName;
 
	public Department() {
		super();
	}

	public Department(int depNo, String depName) {
		super();
		this.depNo = depNo;
		this.depName = depName;
	}

	public int getDepNo() {
		return depNo;
	}

	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

}
