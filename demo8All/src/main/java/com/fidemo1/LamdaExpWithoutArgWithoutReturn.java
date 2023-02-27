package com.fidemo1;

public class LamdaExpWithoutArgWithoutReturn {
	public static void main(String[] args) {
		MyInterface myInterface = () -> {
			System.out.println("Welcom to Lamda");
			System.out.println("second welcomm to Lamda");
		};
		myInterface.fun();

	}

}
