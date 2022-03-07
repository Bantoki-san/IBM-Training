package com.ibm.bank;

public class Transactions {
	private String type;
	private double amount;
	private double balance;
	public Transactions(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	public String print() {
		return type + "\t" + amount + "\t" + balance;
	}
	
}
