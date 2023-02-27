package com.main;

import com.model.ClassA;
import com.model.ClassB;

public class MarksDemo {
	public static void main(String[] args) {
		ClassA classA = new ClassA(50, 60, 70);
		ClassB classB = new ClassB(50, 60, 70, 80);
		System.out.println(classA.getPercentage());
		System.out.println(classB.getPercentage());
	}
}
