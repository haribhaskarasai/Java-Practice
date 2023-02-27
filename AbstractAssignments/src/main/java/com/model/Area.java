package com.model;

public class Area extends Shape{

	@Override
	public float rectangele(float length, float breadth) {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public float square(float side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public float circle(float radius) {
		// TODO Auto-generated method stub
		return ((22*radius*radius)/7);
	}

}
