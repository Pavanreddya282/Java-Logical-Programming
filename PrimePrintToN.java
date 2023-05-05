package com.JavaPractice;

import java.util.Scanner;

public class PrimePrintToN {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=input.nextInt();
		
		input.close();
		
		for(int i=2;i<=num;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i+" ");
			}
		}
	}

}
