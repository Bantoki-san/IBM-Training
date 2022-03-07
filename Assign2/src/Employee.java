
public class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int counter=1001;

	public Employee() {
	}

	// TASK:Auto Generate empNo in a SEQUENCE starting from 1001
	public Employee(String empName, double salary) {
		this.empNo = counter++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip() {
		System.out.println("EmpNo: " + empNo);
		System.out.println("Empname: " + empName);
		System.out.println("Salary: " + salary);
	}

	public double getSalary() {
		return salary;
	}

}
