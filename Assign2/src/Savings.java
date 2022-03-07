
public class Savings extends Accounts {

	public Savings() {

	}

	public Savings(int actNo, String holder) {
		super(holder, 1000);
	}

	@Override
	public void withdraw(double amount) {
		if (amount < (balance - 1000)) {
			balance -= amount;
		} else
			System.out.println("Insufficient Balance");
	}

}
