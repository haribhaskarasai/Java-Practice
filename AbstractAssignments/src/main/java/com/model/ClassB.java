package com.model;

public class ClassB extends Marks{
	private int mark1;
	private int mark2;
	private int mark3;
	private int mark4;

	public ClassB(int mark1, int mark2, int mark3, int mark4) {
		super();
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}

	@Override
	public float getPercentage() {
		// TODO Auto-generated method stub
		return ((this.mark1+this.mark2+this.mark3+this.mark4)*100)/400;
	}

}
