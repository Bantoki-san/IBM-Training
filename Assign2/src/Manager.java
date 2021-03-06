
public class Manager extends Employee {
	private double comission;

	public Manager() {
		super();
	}

	public Manager(String empName, double salary, double comission) {
		super(empName, salary);
		this.comission = comission;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Comission: " + comission);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + comission;
	}

}
