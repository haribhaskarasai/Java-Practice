package com.main;

import java.util.Scanner;

import com.model.Area;

public class AreasDemo {

	public static void main(String[] args) {
		Area area = new Area();
		System.out.println("Area of Rectangle is :" + area.rectangele(10, 20));
		System.out.println("Area of Square is    :" + area.square(20));
		System.out.println("Area of Cirle is     :" + area.circle(5));
		
		Area[] rectangleAreas=new Area[13];
		System.out.println("Rectangle Areas  :");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < rectangleAreas.length; i++) {
			System.out.println("Rectangle Areas  :");
		}
	}

}
