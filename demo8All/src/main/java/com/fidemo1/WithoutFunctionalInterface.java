package com.fidemo1;

public class WithoutFunctionalInterface {

	public static void main(String[] args) {
		MyInterface myInterface = new MyClassImpl();
		myInterface.defaultMehod1();
		myInterface.defaultMehod2();
		MyInterface.staticFuncton1();
		MyInterface.staticFuncton2();

	}

}
