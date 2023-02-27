package com.model;

public class ClassA extends Marks{
	private int mark1;
	private int mark2;
	private int mark3;

	public ClassA(int mark1, int mark2, int mark3) {
		super();
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	@Override
	public float getPercentage() {
		return ((this.mark1+this.mark2+this.mark3)*100)/300;
	}

}
