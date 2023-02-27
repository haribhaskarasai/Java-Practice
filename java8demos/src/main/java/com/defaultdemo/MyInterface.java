package com.defaultdemo;

public interface MyInterface {
	public static final int VAR = 10;

	public abstract void display();

	public default int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}
}
