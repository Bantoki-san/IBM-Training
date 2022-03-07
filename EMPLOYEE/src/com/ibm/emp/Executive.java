package com.ibm.emp;
/**
 * This class has the details of the Employee type Executive and the calculations for his payslip
 * @author Bantoki
 * @version 1.0
 *
 */
public class Executive extends Employee {
	private double incentives;
/**
 * Default Constructor
 */
	public Executive() {
	}

	/**
	 * Here we have the Parameterised Constructor
	 * @param empName - takes the name of the employee
	 * @param salary - takes the salary of the employee
	 * @param incentives - takes the incentives of the employee
	 */
	public Executive(String empName, double salary, double incentives) {
		super(empName, salary);
		this.incentives = incentives;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Incentives: " + incentives);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + incentives;
	}
}
