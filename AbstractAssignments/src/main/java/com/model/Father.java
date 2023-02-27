package com.model;

public abstract class Father {
	
 public Father() {
	 System.out.println("This is constructor of abstract class");
 }
 public abstract void hasMethod();
 public static void nonAbstractMethod() {
	 System.out.println("This is a normal method of abstract class");
 }
}
