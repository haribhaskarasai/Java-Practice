package com.main;

import com.model.AnotherCalculator;
import com.model.Calculator;
import com.model.CalculatorImp;

public class CalculatorMain {

	public static void main(String[] args) {
		System.out.println(Calculator.a);//how to refer static variable i.e class level variable
		
		
		
		//interfaceName obj= new ImplementationClass(;);
		Calculator calculator=new CalculatorImp();
		
		System.out.println("addition of two numbers : " +calculator.add(2, 3));
		calculator.display();
		
		AnotherCalculator anotherCalculator=new CalculatorImp();
		System.out.println("subtraction of two numbers : " +anotherCalculator.sub(52, 5));
		anotherCalculator.display();
		
		
	}

}
