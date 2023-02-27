package com.service;

import java.util.Iterator;
import java.util.Set;

import com.model.Student;

public class StudentService {
	public Student searchStudentById(Set set, int id) {
		Student tempStud = null;
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Student object = (Student) iterator.next();
			if (object.getStdId() == id) {
				tempStud = object;
			}

		}
		return tempStud;

	}

}
