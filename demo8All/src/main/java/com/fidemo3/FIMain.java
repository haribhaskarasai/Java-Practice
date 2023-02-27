package com.fidemo3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class FIMain {
	public static void main(String[] args) {
		MyInterfaceWithTwoParamAndReturn interfaceWithTwoParamAndReturn = (a, b) -> {
			System.out.println("Two parameters are  : " + a + ", " + b);
			return a + b;
		};
		int b = interfaceWithTwoParamAndReturn.add(20, 40);
		System.out.println("sum is : " + b);

		BiFunction<Integer, Integer, Integer> biFunction = (arg1, arg2) -> {
			System.out.println("Two parameters are  : " + arg1 + ", " + arg2);
			return arg1 + arg2;
		};
		System.out.println("predefined  BiFunction result is :");
		int c = biFunction.apply(10, 20);
		System.out.println("sum is : " + c);

		// Biconsumer is for two parameters

		BiConsumer<String, Float> biConsumer = (arg1, arg2) -> {
			System.out.println("Employee name is : " + arg1 + " & Employee salary is : " + arg2);
		};
		System.out.println("predefined  BiConsumer result is : ");
		biConsumer.accept("Hari", 20000f);

	}
}
