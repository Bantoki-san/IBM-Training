package p1;

import java.util.*;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance, hours, minutes, seconds;
		System.out.println("Enter Distance in metres :");
		distance = sc.nextInt();
		System.out.println("Enter time in hours :");
		hours = sc.nextInt();
		System.out.println("Enter time in minutes :");
		minutes = sc.nextInt();
		System.out.println("Enter time in seconds :");
		seconds = sc.nextInt();
		double totaltime = hours * 3600 + minutes * 60 + seconds;
		double speedms = distance / totaltime;
		System.out.println("The speed in m/s is " + speedms);
		double distkm = distance / 1000;
		double hrtime = totaltime / 3600;
		double speedkmhr = distkm / hrtime;
		System.out.println("The speed in m/s is " + speedkmhr);
		double distmil = distance * 0.000621371;
		double speedmilhr = distmil / hrtime;
		System.out.println("The speed in mil/hr is " + speedmilhr);

	}

}
