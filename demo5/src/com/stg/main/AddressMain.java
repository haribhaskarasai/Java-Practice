package com.stg.main;

import com.stg.model.Address;
import com.stg.model.Employee;

public class AddressMain extends java.lang.Object {
	public static void main(String[] args) {
		Address address = new Address();
		AddressMain addressMain = new AddressMain();
		addressMain.printingDetails(address);

		System.out.println();

		Address address2 = new Address(25, "3rd street", "Chennai", "TamilNadu");
		addressMain.printingDetails(address2);
		
		System.out.println();
		
		Employee employee1 = new Employee();
		employee1.setEmpNo(123);
		employee1.setEmpName("hari");
		
	}

	void printingDetails(Address var) {
		System.out.println("Door Number : " + var.getDoorNo());
		System.out.println("Street      : " + var.getStreet());
		System.out.println("City        : " + var.getCity());
		System.out.println("Address     : " + var.getStreet());

	}
}
