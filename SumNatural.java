package com.JavaPractice;

import java.util.Scanner;

public class SumNatural {
	
	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of natural numbers from 1 to " + n + " is "+sum);
	}

}
