package p1;

import java.util.*;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int t,digit,count = 0;
		int num = sc.nextInt();
		t=num;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		while(t>0)
		{
			digit = t%10;
			t=t/10;
			System.out.println(digit);
			count--;
		}
	}

}