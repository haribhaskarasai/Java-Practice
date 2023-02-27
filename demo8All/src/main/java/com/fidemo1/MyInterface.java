package com.fidemo1;

@FunctionalInterface   //it will not let us to create another abstract method
public interface MyInterface {
	//single abstract method
	public abstract void fun();
	public default void defaultMehod1() {
		System.out.println("Inside default method1");
	}
	public default void defaultMehod2() {
		System.out.println("Inside default method2");
	}
	static void staticFuncton1() {
		System.out.println("Static method1");
	}
	static void staticFuncton2() {
		System.out.println("Static method2");
	}
}
