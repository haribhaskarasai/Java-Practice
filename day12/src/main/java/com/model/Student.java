package com.model;

public class Student {
	private int stdId;
	private String stdName;
	private int age;
	private float mark1;

	public Student() {
		super();
	}

	public Student(int stdId, String stdName, int age, float mark1) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.age = age;
		this.mark1 = mark1;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getMark1() {
		return mark1;
	}

	public void setMark1(float mark1) {
		this.mark1 = mark1;
	}

}
