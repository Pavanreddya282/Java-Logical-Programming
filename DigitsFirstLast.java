package com.JavaPractice;

import java.util.Scanner;

public class DigitsFirstLast {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n= sc.nextInt();
		sc.close();
		
		int firstDigit,lastDigit;
		
		lastDigit=n%10;
		
		while(n>=10) {
			n/=10;
		}
		firstDigit=n;
		
		System.out.println("First digit of " + n + " is " + firstDigit);
        System.out.println("Last digit of " + n + " is " + lastDigit);
	}

}
