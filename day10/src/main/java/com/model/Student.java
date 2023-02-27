package com.model;

public class Student {
	private int stdId;
	private String stdName;
	private float mark;

	public Student() {
		super();
	}

	public Student(int stdId, String stdName, float mark) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.mark = mark;
	};

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

}
