package com.JavaPractice;

import java.util.Scanner;

public class PrimeFactorsOfNum {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=input.nextInt();
		
		input.close();
		
		for(int i=2;i<=num;i++) { // "i=2;num=12,"  i increment to 3 & num become 3,, so (2<=1) false exit for
			
			while(num%i==0) { //12%2==0, 6%2==0, 3%2!=0 exit while, 3%3==0
				System.out.print(i+" "); // 2, 2, 3
				num/=i; // 12/2=6, 6/2=3, 3/3==1 become num=1
			}
		}
		if(num!=1) // to print last prime number for example 540 u get last reminder 5 which is prime
			System.out.println(num);
	}

}
