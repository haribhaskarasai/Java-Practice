package com.stg.main;



public class MainArrayDemo1 {

	public static void main(String[] args) {
		int[] var = { 1, 2, 3, 4, 5 };
		System.out.println(var.length);
		int temp=0;
		for (int i = 0; i < var.length; i++) {
			temp += var[i];
		}
		System.out.println(temp);
	}

}
