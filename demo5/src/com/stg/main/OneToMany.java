package com.stg.main;

import com.stg.model.Address;
import com.stg.model.Employee;

public class OneToMany {
	public static void main(String[] args) {
		Address address1 = new Address(10, "sivalayam street", "chennai", "TN");
		Address address2 = new Address(11, "kanachana street", "chennai", "TN");
		Address address3 = new Address(12, "taramani street", "chennai", "TN");
		Address[] addresses = new Address[3];
		addresses[0] = address1;
		addresses[1] = address2;
		addresses[2] = address3;

		Employee employee1 = new Employee();
		employee1.setEmpNo(212);
		employee1.setEmpName("Hari");
		employee1.setAddresses(addresses);
		;

		System.out.println("Employee Number  : " + employee1.getEmpNo());
		System.out.println("Employee Name    : " + employee1.getEmpName());
		Address[] allAdresses = employee1.getAddresses();
		for (int i = 0; i < allAdresses.length; i++) {
			System.out.println(allAdresses[i].getDoorNo());
		}
	}

}
