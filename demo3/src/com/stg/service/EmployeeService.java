package com.stg.service;

public class EmployeeService {
	public String function(int arg) {
		return "The data passed is " + arg;
	}

	public int sumOfArray(int[] myArray) {
		int temp = 0;
		for (int i = 0; i < myArray.length; i++) {
			temp += myArray[i];
		}
		return temp;

	}

	public String strConcatenation(String[] var) {
		String temp = "";
		for (int i = 0; i < var.length; i++) {
			temp += var[i];
		}
		return temp;
	}
	public String[] returnArrayOfString() {
		String[] allString= {"apple","mango","grapes"};
		return allString;
		
	}
}
