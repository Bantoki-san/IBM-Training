package p1;

import java.util.*;
import java.math.*;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in pounds:");
		int wt = sc.nextInt();
		System.out.println("Enter Height in inches:");
		int ht = sc.nextInt();
		double bmi = (wt / (Math.pow(ht, 2)) * 703);
		System.out.println("The BMI is " + bmi);
	}

}
