/*
 * A perfect number is a positive integer that is equal to the sum of its proper divisors,
 *  excluding the number itself. 
 *  For example, 6 is a perfect number because its proper divisors (excluding 6) are 1, 2, and 3, 
 *  and 1+2+3=6. 
 *  */


package com.JavaPractice;

import java.util.Scanner;

public class PerfectNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<=n/2;i++) { // divisors excluding number itself
			if(n%i==0) {  // proper divisors of a number
				sum+=i;   // sum of each proper divisor
			}
		}
		if(sum==n)   // total sum of proper divisors equal to number
			System.out.println(n+ " is a Perfect Number");
		else
			System.out.println(n+ " is not a perfect number");
	}

}
