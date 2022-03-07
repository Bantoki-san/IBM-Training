package p1;

import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length in inches: ");
		double inc = sc.nextDouble();
		double met = inc * 0.0254;
		System.out.println("The length in metre is : " + met);

	}
}