package com.model;

public abstract class AbstractClass {

	public AbstractClass() {
		System.out.println("This is Abstract class Constructor");
	}

	public abstract void a_Method();

	public void nonAbstractMethod() {
		System.out.println("This is a normal method of abstract class");
	}

	

}
