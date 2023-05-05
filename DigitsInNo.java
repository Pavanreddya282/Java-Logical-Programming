package com.JavaPractice;

import java.util.Scanner;

public class DigitsInNo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		sc.close();
		
		int count=0;
	
		while(n!=0) {
			n=n/10;
			count++;
		}
		//int numOfDigits= String.valueOf(n).length();
//		for (; n != 0; n /= 10) {
//      count++;
//  }

		System.out.println("Number of digits in the given number is "+count);
		//System.out.println("Number of digits in the given number is "+numOfDigits);
	}
}
