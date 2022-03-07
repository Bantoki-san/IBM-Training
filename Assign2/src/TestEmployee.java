
public class TestEmployee {
	public static void main(String[] args) {

		//Employee e1 = new Employee("Polo", 3000);
		//e1.payslip();
		
		Executive exec = new Executive("Mona", 5000 , 2000);
		
		Manager mgr = new Manager("Jack", 7000, 3000);
		
		exec.payslip();
		mgr.payslip();
		//By passing the method in the main method:
		
		//showSalary(exec);
		//showSalary(mgr);
		
		
		
	}

	private static void showSalary(Manager mgr) {
		// TODO Auto-generated method stub
		System.out.println("Manager Salary: "+ mgr.getSalary());
	}

	private static void showSalary(Executive exec) {
		// TODO Auto-generated method stub
		System.out.println("Executive Salary: "+exec.getSalary());
	}

}
