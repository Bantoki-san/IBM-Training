package p1;

import java.util.*;

public class Q9 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		a = sc.nextInt();
		System.out.println("Enter the Second Number:");
		b = sc.nextInt();

		System.out.println("The sum = " + (a + b));
		System.out.println("The difference = " + (a - b));
		System.out.println("The product = " + (a * b));
		System.out.println("The average = " + (a + b) / 2);
		System.out.println("The distance = " + Math.abs(a - b));
		System.out.println("The maximum = " + Math.max(a, b));
		System.out.println("The minimum = " + Math.min(a, b));
	}

}
