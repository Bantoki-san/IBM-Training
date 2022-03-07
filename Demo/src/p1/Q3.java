package p1;

import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number between 0 to 1000 ");
		int num, r, s = 0;
		num = sc.nextInt();
		if (num < 0 || num > 1000) {
			System.out.println("Please stay in range");
		} else {
			while (num > 0) {
				r = num % 10;
				num = num / 10;
				s = s + r;
			}
			System.out.println("The sum of digits is : " + s);
		}
	}
}
