package com.fidemo2;

public class FIMain {

	public static void main(String[] args) {
		MyInterfaceWithParam myInterfaceWithParam = (int abc) -> {
			System.out.println("lamda with parameter : " + abc);
			System.out.println("lamda with parameter : " + (abc + 100));
		};
		myInterfaceWithParam.display(22);
	}

}
