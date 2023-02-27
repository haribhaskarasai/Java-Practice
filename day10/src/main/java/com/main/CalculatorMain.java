package com.main;

import java.util.Scanner;

import com.service.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator; // declare
		try {
			System.out.println("Enter first digit : ");
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			System.out.println("Enter second digit : ");
			int b = scanner.nextInt();

			calculator = new Calculator();
			int ans = calculator.add(a, b);
			System.out.println("Addition of " + a + " with " + b + " is : " + ans);

			int anse = calculator.div(a, b);
			System.out.println("divition of " + a + " with " + b + " is : " + anse);
		} catch (ArithmeticException e) {
			System.err.println("soluton for airthexp");
		} catch (Exception e) {
			e.printStackTrace();

		}
		finally {
			System.out.println("Wthere there is eception or not yhis block will excecuted");
			calculator=null;
			
		}
	}

}
