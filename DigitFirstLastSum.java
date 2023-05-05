package com.JavaPractice;

import java.util.Scanner;

public class DigitFirstLastSum {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		sc.close();
		
		int firstDigit,lastDigit;
		
		lastDigit=num%10;
		
		while(num>=10) {
			num=num/10;
		}
		firstDigit=num;
		
		int sum=firstDigit+lastDigit;
		
		System.out.println("Sum of First and Last Digit: "+sum);
	}

}
