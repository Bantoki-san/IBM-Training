package p1;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit: ");
		double f = sc.nextDouble();
		double c = (f - 32) * (5 / 9);
		System.out.println("The Temperature in Degree C is : " + c);
	}
}
