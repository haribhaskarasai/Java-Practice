package com.main;

import com.model.Child;

public class FatherDemo {

	public static void main(String[] args) {
		Child child = new Child();
		child.hasMethod();
		child.nonAbstractMethod();
	}

}
