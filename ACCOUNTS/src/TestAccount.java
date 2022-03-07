import com.ibm.bank.Account;
import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;
import com.ibm.bank.Current;
import com.ibm.bank.Savings;

public class TestAccount {
	public static void main(String[] args) {

//		AccountFactory factory = new AccountFactory(); TAKES UP MEMORY AS OBJECT IS CREATED
		// SO MAKE THE METHODS IN ACCOUNT FACTORY STATIC

//		Bank c = AccountFactory.openCurrent("Polo");
////		Account c = new Current("Polo"); DO NOT WANT TO GIVE ACCESS TO MAIN CLASSES
//		// SO USES ACCOUNT FACTORY
//
//		c.withdraw(4000);
//		c.withdraw(6000);
//
//		c.deposit(3000);
//		c.deposit(5000);
//		c.statement();

		Bank s = AccountFactory.openSavings("Jack");
		try {
			s.withdraw(4000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(); //for developers - to troubleshoot errors
//			System.out.println(e); //for logging - to audit the behaviour of an application
			System.out.println(e.getMessage()); //for end-users
		}
		
//		Savings s = new Savings("Jim");
//		s.deposit(2000);
//		s.withdraw(1000);
//		s.deposit(1000);
//		s.withdraw(1500);
//		s.statement();

	}
}
