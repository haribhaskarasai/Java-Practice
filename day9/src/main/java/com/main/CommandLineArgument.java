package com.main;

import java.util.Scanner;

import com.model.Student;

public class CommandLineArgument {

	public static void main(String[] abc) {
		System.out.println(abc[0]);// first data after java filename abc[0] abc[2] in cmd
		System.out.println(abc[1]);
		System.out.println(abc[2] + 100);
		System.out.println(Float.parseFloat(abc[3]) + 10);

		Integer integer = new Integer(55);
		int val = integer.parseInt("33");
		System.out.println(100 + val);
		System.out.println(integer);

		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter integer : ");
		int value = scanner.nextInt();
		System.out.println(value + 100);

		System.out.println("Enter student id: ");
		Scanner input = new Scanner(System.in);
		Student student = new Student();
		student.setStudId(input.nextInt());

		System.out.println("Enter student name: ");
		student.setStudName(input.next());

		System.out.println("Enter student mark: ");
		student.setMark(input.nextFloat());

		System.out.println("Entered data");
		System.out.println(student.getStudId());
		System.out.println(student.getStudName());
		System.out.println(student.getMark());

		input.close();

	}

}
