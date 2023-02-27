package com.stg.main;

import com.stg.model.Address;

public class AdressMemory {

	public static void main(String[] args) {
		Address address = new Address();
		System.out.println(address);// memory location of object== object reference
		System.out.println(address.getDoorNo());

	}

}
