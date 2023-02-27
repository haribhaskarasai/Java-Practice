package com.referenceconstructor;

public class ReferenceConstructorMain {

	public static void main(String[] args) {
		MyInterface myInterface = Employee::new;
		Employee employee = myInterface.sayHello(12, "Hari", 100000);
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getEmpName());

	}

}
