package com.model;

public class Child extends Parent {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		System.out.println("using child " + super.sayHello());
		return "CHILD HELLO " + a;
	}

	public int add(int a, int b) {
		return a + b;
	}

}
