
public class Executive extends Employee {
	private double incentives;
	
	public Executive() {
	}
	
	public Executive(String empName, double salary, double incentive)
	{
		super(empName,salary);
		this.incentives = incentives;
	}
	
	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Incentives: "+incentives);
	}
	@Override
	public double getSalary()
	{
		return super.getSalary();
	}

}
