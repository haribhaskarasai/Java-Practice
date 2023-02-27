package com.main;

import com.model.Child;
import com.model.Parent;

public class InheritenceDemo {

	public static void main(String[] args) {
		Parent parent = new Parent();
		// only parent info can be accessed
		System.out.println(parent.sayHello());

		Child child = new Child();
		// child parent info can be accessed
		System.out.println(child.sayHello());

		// Parent var=new Child()  >through abstraction
		System.out.println();
		Parent parent2 = new Child();
		System.out.println(parent2.sayHello());

	}

}
