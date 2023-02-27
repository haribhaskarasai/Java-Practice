package com.main;

import com.service.RulesInterface;
import com.service.RulesInterfaceImpl;
import com.service.RulesInterfaceImpl2;

public class RulesInterfaceMain {

	public static void main(String[] args) {
		RulesInterface rulesInterface = new RulesInterfaceImpl();
		rulesInterface.display();
		String string = rulesInterface.sayHello("Hello");
		System.out.println(string);
		RulesInterface rulesInterface1 = new RulesInterfaceImpl2();
		rulesInterface1.display();

	}

}
