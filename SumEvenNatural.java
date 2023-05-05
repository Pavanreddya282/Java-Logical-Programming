package com.JavaPractice;

import java.util.Scanner;

public class SumEvenNatural {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		sc.close();		
		int i=0;
		while(i<=n) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("Sum of natural even numbers from 1 to " + n + " is "+sum);
	}
}
