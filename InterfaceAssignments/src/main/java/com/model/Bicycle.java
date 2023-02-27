package com.model;

public class Bicycle extends Vehicle {
	public String bicycleName;
	public String bicycleModel;
	public Bicycle(String bicycleName, String bicycleModel) {
		super();
		this.bicycleName = bicycleName;
		this.bicycleModel = bicycleModel;
	}
	public String getBicycleName() {
		return bicycleName;
	}
	public void setBicycleName(String bicycleName) {
		this.bicycleName = bicycleName;
	}
	public String getBicycleModel() {
		return bicycleModel;
	}
	public void setBicycleModel(String bicycleModel) {
		this.bicycleModel = bicycleModel;
	}
	
}
