
public abstract class Accounts implements Bank {

	private int acntNo;
	private String holder;
	private double balance;
	
	private static int autogen=INIT_ACNT_NO;

	public Accounts() {
	}

	public Accounts(String holder, double balance) {
		super();
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
	}

	public void summary() {
		System.out.println("A/C No.: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	// BL Methods

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= balance)
			balance -= amount;
		else
			System.out.println("Insufficient Balance!");
	}
}
