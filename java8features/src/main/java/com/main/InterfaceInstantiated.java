package com.main;

import com.service.MyInterface;

public class InterfaceInstantiated {

	public static void main(String[] args) {
		MyInterface objRef = new MyInterface() {

			@Override
			public String sayHello(String name) {
				// TODO Auto-generated method stub
				return "Welcom: " + name;
			}
		};
		String temp = objRef.sayHello("Hari");
		System.out.println(temp);

	}

}
