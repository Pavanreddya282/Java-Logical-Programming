package com.JavaPractice;

import java.util.Scanner;

public class PrimeCheck {
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=input.nextInt();
		
		input.close();
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		
		if(count==2) {
			System.out.println(num+" is a PrimeNumber");
		}else
			System.out.println(num+" is not a PrimeNumber");
		System.out.println(Math.sqrt(num));
	}

}


