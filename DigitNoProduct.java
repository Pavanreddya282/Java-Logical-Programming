package com.JavaPractice;

import java.util.Scanner;

public class DigitNoProduct {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		sc.close();
		int product=1;

		while(num>0) {
			int digit=num%10;
			product*=digit;
			num/=10;
		}
		
		System.out.println("The product of digits of a Number :"+product);
	}

}
