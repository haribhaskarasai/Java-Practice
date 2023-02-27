package com.model;

public abstract class Bank {
	protected int balance;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public abstract int getBalance();
}
