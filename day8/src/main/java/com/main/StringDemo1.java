package com.main;

public class StringDemo1 {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str.length());
		StringBuffer stringBuffer=new StringBuffer("Hello");
		System.out.println(stringBuffer.length());
		System.out.println("Additional Space "+stringBuffer.capacity());
		stringBuffer.append("World");
		System.out.println("Additional Space after Append"+stringBuffer.capacity());
		stringBuffer.append("World bsiqaik nJN SNDLA");
		System.out.println("Additional Space after Append"+stringBuffer.capacity());
		
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Good");
		System.out.println("String Builder Data : "+stringBuilder);
		

	}

}
