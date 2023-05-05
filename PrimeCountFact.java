package com.JavaPractice;

public class PrimeCountFact {
	
	public static void main(String args[]) {
		
		int count=0;
		
		for(int i=1;i<=100;i++) {
			int factors=0;
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					factors++;
				}
			}
			if(factors==2) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nThe number of primes between 1 and 100 is "+count);
	}
}
