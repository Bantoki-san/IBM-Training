import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {
	public static void main(String[] args) {
//		Employee e1 = new Employee("Polo", 3000);
//		e1.payslip();

		Executive exec = new Executive("Mona", 5000, 2000);

		Manager mgr = new Manager("Jack", 7000, 3000);
//		exec.payslip();
//		mgr.payslip();
//		System.out.println("Executive Salary: " + exec.getSalary());
//		System.out.println("Manager Salary: " + mgr.getSalary());

		showSalary(exec);
		showSalary(mgr);
	}

	private static void showSalary(Employee emp) {
		if(emp instanceof Manager)
			System.out.println("Manager salary: " + emp.getSalary());
		else
			System.out.println("Executive salary: " + emp.getSalary());
		
	}

//	private static void showSalary(Manager mgr) {
//		System.out.println("Manager Salary: " + mgr.getSalary());
//	}
//
//	private static void showSalary(Executive exec) {
//		System.out.println("Exexcutive Salary: " + exec.getSalary());
//	}

}
