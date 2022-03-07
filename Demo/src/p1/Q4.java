package p1;

import java.util.*;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time in minutes: ");
		int min = sc.nextInt();
		int yr = min / (365 * 24 * 60);
		int days = (min / 60 / 24) % 365;
		System.out.println("The Time is : " + yr + " years " + days + " days");
	}
}
