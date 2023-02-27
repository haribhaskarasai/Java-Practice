package com.main;

import com.service.Calculator;
import com.service.CalculatorImp;

public class CalculatorMain {

	public static void main(String[] args) {
		// interfaceName var=new Impl();
		Calculator calculator = new CalculatorImp();
		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.sub(10, 20));
		System.out.println(calculator.mul(10, 20));
		System.out.println(calculator.div(10, 20));

	}

}
