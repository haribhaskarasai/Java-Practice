package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.SortByStdAge;
import com.model.SortByStdId;
import com.model.Student;

public class StudentApp {

	public static void main(String[] args) {
		Student student1 = new Student(15, "Hari", 25, 88);
		Student student2 = new Student(19, "Giri", 25, 80);
		Student student3 = new Student(17, "Balu", 30, 78);
		Student student4 = new Student(18, "Venky", 24, 85);
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		System.out.println(students.size());

		for (Student student : students) {
			System.out.println(student.getStdId() + " " + student.getStdName());
		}
		Collections.sort(students, new SortByStdId());
		System.out.println("Aftre sort by Id:");
		System.out.println();
		for (Student student : students) {
			System.out.println(student.getStdId() + " " + student.getStdName());
		}

		Collections.sort(students, new SortByStdAge());
		System.out.println("Aftre sort by Age:");
		System.out.println();
		for (Student student : students) {
			System.out.println(student.getStdId() + " " + student.getStdName() + " " + student.getAge());
		}

	}

}
