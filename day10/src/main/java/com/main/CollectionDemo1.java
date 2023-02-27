package com.main;

import java.util.HashSet;
import java.util.Set;

import com.model.Student;
import com.service.StudentService;

public class CollectionDemo1 {

	public static void main(String[] args) {
		int[] intArray = new int[3];

		// interface var=new impl()
		Student student1 = new Student(10, "Hari", 99f);
		Student student2 = new Student(11, "Venky", 99f);
		Student student3 = new Student(12, "Giri", 90f);

		Set set = new HashSet(); // Bag
		set.add(student1);
		set.add(student2);
		set.add(student3);
		System.out.println("How many objects are stored : " + set.size());
		StudentService studentService = new StudentService();
		Student ans = studentService.searchStudentById(set, 51);
		if (ans != null) {
			System.out.println(ans.getStdId());
			System.out.println(ans.getStdName());
			System.out.println(ans.getMark());
		} else {
			System.out.println("No such Id");
		}
		student1 = null;
		student2 = null;
		student3 = null;

	}

}
