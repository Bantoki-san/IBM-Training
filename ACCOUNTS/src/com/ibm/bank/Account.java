package com.ibm.bank;

public abstract class Account implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;

	private static int autogen = INIT_ACNT_NO;

	protected Transactions[] txns;
	protected int idx;

	public Account() {
	}

	public Account(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;

		txns = new Transactions[10];
	}

	public void summary() {
		System.out.println("Account Number: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	// BL Methods
	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transactions("CREDIT", amount, balance);
	}

	@Override
	public void statement() {
		System.out.println("Statement of Account: " + acntNo);
		for(int i =0;i<idx;i++) {
			System.out.println(txns[i].print());
		}
	}
	
	

	/*
	 * Both child classes have their own withdraw methods so it is useless but the
	 * withdraw method in TestAccount becomes error if it is removed so we abstract
	 * it OR we can create an interface Ban(here) and make the withdraw method there
	 * to make it abstract and remove the one used in this class
	 */

//	public abstract void withdraw(double amount);

}
