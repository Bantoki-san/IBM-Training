package com.ibm.bank;

public class Savings extends Account {

	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BAL);
		txns[idx ++] = new Transactions("OPENING BALANCE", MIN_SAVINGS_BAL, balance);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount < (balance-MIN_SAVINGS_BAL)) {
			balance -= amount;
			txns[idx++] = new Transactions("DEBIT", amount, balance);
		}
		else
			throw new BalanceException("Insufficient Balance");
	}
}
