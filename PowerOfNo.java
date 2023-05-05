package com.JavaPractice;

import java.util.Scanner;

public class PowerOfNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Base Number");
		int base = sc.nextInt(); // base number is 5
		
		System.out.println("Enter the Exponent Number");
		int exponent = sc.nextInt(); // exponent is 2
		sc.close();
		int result=1;
		
		for(int i=1;i<=exponent;i++) { //i =1;i<=1, i=2;i<=2.
			result*=base;              //5*1=5, 5*5=25.
		}
		
		System.out.println(base + " raised to the power " + exponent + " is " + result);
	}

}
