package com.main;

import com.service.OuterClass;

public class InnerClassDemo {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerObj = outerClass.new InnerClass();
		innerObj.innerMethod();

	}

}
