package com.model;

public class Bike extends Vehicle {
	private String bikeName;
	private String bikeModel;
	public Bike(String bikeName, String bikeModel) {
		super();
		this.bikeName = bikeName;
		this.bikeModel = bikeModel;
	}
	
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikeModel() {
		return bikeModel;
	}
	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}
	

}
