package com.main;

import com.model.BankA;
import com.model.BankB;
import com.model.BankC;

public class BankDemo {

	public static void main(String[] args) {
		BankA bankA = new BankA();
		BankB bankB = new BankB();
		BankC bankC = new BankC();
		bankA.setBalance(100);
		bankB.setBalance(150);
		bankC.setBalance(200);
        
   
		System.out.println("Deposite in BankA is : " + bankA.getBalance());
		System.out.println("Deposite in BankB is : " + bankB.getBalance());
		System.out.println("Deposite in BankB is : " + bankC.getBalance());

	}

}
