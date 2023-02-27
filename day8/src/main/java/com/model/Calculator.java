package com.model;

public interface Calculator {
	public static final int a = 10;
	//pure abstract method=method declaration
	public int add(int num1,int num2);
	public int mul(int num1,int num2);
	
	public abstract void display();
}
