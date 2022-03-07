package com.ibm.emp;
/**
 * This class has the details of the Employee type Manager and the calculations for his payslip
 * @author Bantoki
 * @version 1.0
 */
public class Manager extends Employee {
	private double comission;

	/**
	 * Here we have the Default Constructor
	 */
	public Manager() {
	}

	/**
	 * Here we have the Parameterised Constructor
	 * @param empName - takes the name of the employee
	 * @param salary - takes his/her salary
	 * @param comission - takes the comission of the employee
	 */
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
