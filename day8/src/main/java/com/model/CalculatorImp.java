package com.model;

public class CalculatorImp implements Calculator, AnotherCalculator {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int div(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	@Override
	public void display() {
		System.out.println("Display function");

	}

}
