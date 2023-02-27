package com.service;

public interface VehicleService {
	public abstract int speedUp(int increaseSpeed);
	public abstract void applyBrakes(int decreaseSpeed); 
	public abstract int changeGear(int newGear);

}
