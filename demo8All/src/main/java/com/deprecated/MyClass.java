package com.deprecated;

public class MyClass {
	@Deprecated
	int var;
	int anothervar;
	
	public void hello() {
		System.out.println("Welcom to hello");
	}
	public String hello(int a) {
		return "Welcom : "+ a;
	}
}
