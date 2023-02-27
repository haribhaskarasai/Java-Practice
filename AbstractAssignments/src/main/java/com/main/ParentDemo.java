package com.main;

import com.model.SubClass1;
import com.model.SubClass2;

public class ParentDemo {

	public static void main(String[] args) {
		SubClass1 subClass1 = new SubClass1();
		System.out.println(subClass1.displayMessage());
		SubClass2 subClass2 = new SubClass2();
		System.out.println(subClass2.displayMessage());

	}

}
