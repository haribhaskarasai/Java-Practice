package com.service;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int div(int a, int b) {
		int result = 0;
		if (a > 0 && b > 0) {
			result = a / b;
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
		return result;
	}
}
