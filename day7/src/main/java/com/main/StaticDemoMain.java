package com.main;

import com.model.StaticDemo;

public class StaticDemoMain {

	public static void main(String[] args) {
		StaticDemo staticDemo = new StaticDemo();
		staticDemo.intVariable = 10;
		staticDemo.display();// instatence method which can accessed afetr creation of object

		StaticDemo staticDemo2 = new StaticDemo();
		staticDemo2.intVariable = 10;// instance variable
		StaticDemo.staticIntVariable = 22;
		System.out.println("static data : " + staticDemo.staticIntVariable);
		StaticDemo.SayHello();

	}
	static {
		System.out.println("Static Block");
	}// ststic block after static main

}
