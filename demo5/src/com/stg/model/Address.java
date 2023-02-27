package com.stg.model;

public class Address {
	private int doorNo;
	private String street;
	private String city;
	private String state;
	public Address() {
		super();
	}
	
	public String toString() {
		return "wont share the adress";
	}
	public Address(int doorNo) {
		super();
		this.doorNo = doorNo;
	}
	public Address(int doorNo, String street, String city, String state) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
