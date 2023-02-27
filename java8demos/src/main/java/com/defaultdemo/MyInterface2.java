package com.defaultdemo;

public interface MyInterface2 {
	public default int add(int a,int b) {
		return a+b;
	}

}
