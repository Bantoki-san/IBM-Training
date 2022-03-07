package p1;

import java.util.*;
import java.math.*;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		double sq = Math.pow(num, 2);
		double cu = Math.pow(num, 3);
		double fp = Math.pow(num, 4);

		System.out.println("The square of the number is " + sq + " The cube of the number is " + cu
				+ " The fourth power of the number is " + fp);
	}

}
