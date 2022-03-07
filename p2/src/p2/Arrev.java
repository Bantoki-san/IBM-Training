package p2;

import java.util.*;

public class Arrev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array");
		int n = sc.nextInt();
		int i;
		int[] arr = new int[10];
		System.out.println("Enter the elements:");
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The reverese array is :");
		for (i = n - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
