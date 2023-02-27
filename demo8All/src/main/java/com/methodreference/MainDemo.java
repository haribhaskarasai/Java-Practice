package com.methodreference;

public class MainDemo {

	public static void main(String[] args) {
		// using method reference
		MyClass myClass = new MyClass();
		MyInterface myInterface = myClass::sayHello;
		System.out.println(myInterface.sayHello("Hari"));

		// using lamda function
		MyInterface myInterface2 = (arg) -> {
			return "welcom : " + arg;
		};
		System.out.println(myInterface2.sayHello("Hari"));

	}

}
