package p2;

import java.util.*;

public class Arrsumavg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int n, i, s = 0;
		double avg;
		System.out.println("Enter the number of elements you want in the array:");
		n = sc.nextInt();
		System.out.println("Enter the elements of the array :");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			s = s + a[i];
			avg = s / n;
			System.out.println("The sum is :" + s);
			System.out.println("The average is :" + avg);
		}

	}

}
