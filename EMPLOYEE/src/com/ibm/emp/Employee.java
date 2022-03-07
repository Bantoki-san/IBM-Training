package com.ibm.emp;

/**
 * This class represents the Payslip Generation of A General Employee
 * @author Bantoki
 * @version 1.0
 */
public class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int autogen=1001;//The count for generating Employee Number
/**
 * This is the deafult Constructor
 */
	public Employee() {
	}
	/**
	 * Here we have The Parameterised Constructor
	 * @param empName
	 * @param salary
	 */
	//Auto-Generate Employee Number
	public Employee(String empName, double salary) {
		this.empNo = autogen++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip() {
		System.out.println("Employee Number: " + empNo);
		System.out.println("Employee Name: " + empName);
		System.out.println("Salary: " + salary);
	}

	public double getSalary() {
		return salary;
	}
}
