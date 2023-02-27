package com.main;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(10 / 0);
		} catch (java.lang.ArrayIndexOutOfBoundsException var) {
			System.err.println("solution");
			var.printStackTrace();
		}
		try {

			System.out.println(10 / 0);
		} catch (java.lang.ArithmeticException var) {
			System.err.println("solution2");

		}
		try {

			System.out.println(10 / 0);
		} catch (Exception var) {// generic Exception == parent of all exceptions
			System.err.println("generic solution");

		}
		System.out.println("the end");

	}
}
