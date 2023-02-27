package com.deprecated;

import java.util.Date;

public class DateDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		MyClass myClass =new MyClass();
		myClass.var=20;
		myClass.hello();
		
	}

}
