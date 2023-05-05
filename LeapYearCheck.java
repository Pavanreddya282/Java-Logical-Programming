package com.JavaPractice;
/*If the year is divisible by 4 but not by 100, it is a leap year.
If the year is divisible by 400, it is a leap year.
If the year is divisible by 100 but not by 400, it is not a leap year.*/
import java.util.Scanner;

public class LeapYearCheck {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		sc.close();
		
		if(year%4==0 && year%100==0 || year%400==0) {
			
			System.out.println("It is leap year");
		}
			else
				System.out.println("It is not leap year");
	}

}
