package com.JavaPractice;


public class PrimeCountBool {
	public static void main(String[] args) {

		int count=0;
		
		for(int i=2;i<=100;i++) { // prime numbers from 1 to 100
			boolean prime=true;   // take 1 number out initial prime flag value is true //4
			for(int j=2;j<i;j++) { // iterate the j from 2 to the number less than i  
				if(i%j==0) {  // if i is divisible by any other number in j loop --
					prime=false; //  prime is false it will not count
					//break; // if false i want to break and exit from j loop, it will do by default.
				}
			}
			if(prime==true) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nThe number of primes between 1 and 100 is "+count);
	}
}
