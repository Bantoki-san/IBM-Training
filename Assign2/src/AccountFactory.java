
public class final AccountFactory {
	
	private AccountFactory() {
		
	}

	public Account openSavings(String holder) {
		return new Savings(holder);
	}
	public Account openCurrent(String holder) {
		return new Current(holder);
	}
}
