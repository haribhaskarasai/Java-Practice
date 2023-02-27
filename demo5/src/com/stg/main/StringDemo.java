package com.stg.main;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = new String("Hello");
		if (str1 == str2) {
			System.out.println("Strings are Equal");
		} else {
			System.out.println("Strings are different");
		}
		if (str1 == str3) {
			System.out.println("Strings are Equal");
		} else {
			System.out.println("Strings are different");
		}
		if (str2.equals(str4)) {
			System.out.println("Strings are Equal");
		} else {
			System.out.println("Strings are different");
		}
	}

}
