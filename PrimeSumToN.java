package com.JavaPractice;

import java.util.Scanner;

public class PrimeSumToN {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=input.nextInt();
		
		input.close();
		int sum=0;
		for(int i=2;i<num;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					isPrime=false;
			}
			
			if(isPrime) {
				sum+=i;
			}
		}
		System.out.println("Sum of all prime numbers between 1 to "+num+" is "+sum);
	}

}
