package com.main;

import com.model.AbstractClass;
import com.model.SubClassForAbstract;

public class AbstractClassDemo {

	public static void main(String[] args) {
		AbstractClass subClassForAbstract = new SubClassForAbstract();
		subClassForAbstract.a_Method();
		subClassForAbstract.nonAbstractMethod();
	}

}
