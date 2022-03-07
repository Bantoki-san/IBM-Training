package p2;

import java.util.*;

public class ArrMerg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, i;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];

		System.out.println("Enter the number of elements of the first array :");
		m = sc.nextInt();
		System.out.println("Enter the number of elements of the second array :");
		n = sc.nextInt();

		System.out.println("Enter the elements of th first array :");
		for (i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter elements of the second array :");
		for (i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for (i = 0; i < m; i++) {
			c[i] = a[i];
		}
		for (i = 0; i < n; i++) {
			c[m + i] = b[i];
		}
		for (i = 0; i < (m + n); i++) {
			System.out.println(c[i]);
		}
	}

}
