package com.model;

import java.util.Comparator;

public class SortByStdId implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getStdId() == student2.getStdId()) {
			return 0;
		} else if (student1.getStdId() < student2.getStdId()) {
			return 1;
		}
		return -1;
	}

}
