package com.JavaPractice;

import java.util.Scanner;

public class PrimeCountToN {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=input.nextInt();
		
		input.close();
		int count=0;
		
		for(int i=2;i<=num;i++) {
			boolean prime=true;
			
			for(int j=2;j<i;j++) {
				if(i%j==0)
					prime=false;
			}
			
			if(prime) {
				count++;
			}
		}
		System.out.println("The number of primes between 1 and "+num+" is "+count);
	}

}
