
public class TestAccounts {

	public static void main(String[] args) {
		
		AccountFactory factory = new AccountFactory();
		Bank c = factory.openCurrent("Polo");
		
		c.withdraw(4000);
		c.withdraw(6000);
		
		c.deposit(3000);
		c.deposit(5000);
		c.summary();
		
		/*Current c = new Current(1012, "Polo");
		c.summary();
		
		c.withdraw(4000);
		c.withdraw(6000);
		c.summary();
		
		c.deposit(3000);
		c.deposit(5000);*/
	}
}
