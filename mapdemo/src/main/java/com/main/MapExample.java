package com.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.model.Student;

public class MapExample {

	public static void main(String[] args) {
		Student student1;
		Student student2;
		Student student3;
		Student student4;
		Map<Integer, Student> map = new HashMap<Integer, Student>();

		try {
			student1 = new Student(10, "hari");
			student2 = new Student(11, "venky");
			student3 = new Student(12, "balu");
			student4 = new Student(13, "vamsi");

			map.put(student1.getStdId(), student1);
			map.put(student2.getStdId(), student2);
			map.put(student3.getStdId(), student3);
			map.put(student4.getStdId(), student4);

			Student student = map.get(student2.getStdId());
			System.out.println(student.getStdId());
			System.out.println(student.getStdName());

			System.out.println();

			System.out.println("Print all keys :");
			Set<Integer> s;
			s = map.keySet();
			for (Integer integer : s) {
				System.out.println(integer);
			}

		} finally {
			student1 = null;
			student2 = null;
			student3 = null;
			student4 = null;
		}

	}

}
