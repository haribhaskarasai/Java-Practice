package com.model;

public class Vehicle {
	private int increaseSpead;
	private int decreaseSpeed;
	private int newGear;

	public Vehicle() {
		super();
	}

	public Vehicle(int increaseSpead, int decreaseSpeed, int newGear) {
		super();
		this.increaseSpead = increaseSpead;
		this.decreaseSpeed = decreaseSpeed;
		this.newGear = newGear;
	}

	public int getIncreaseSpead() {
		return increaseSpead;
	}

	public void setIncreaseSpead(int increaseSpead) {
		this.increaseSpead = increaseSpead;
	}

	public int getDecreaseSpeed() {
		return decreaseSpeed;
	}

	public void setDecreaseSpeed(int decreaseSpeed) {
		this.decreaseSpeed = decreaseSpeed;
	}

	public int getNewGear() {
		return newGear;
	}

	public void setNewGear(int newGear) {
		this.newGear = newGear;
	}

}
