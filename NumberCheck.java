package com.JavaPractice;

import java.util.Scanner;

public class NumberCheck {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		sc.close();
		
		if(num>0) {
			System.out.println(num+" is positive");
		}
		else if(num<0) {
			System.out.println(num+" is negative");
		}
		else
			System.out.println("Number is eqaul to zero");
		
	}
}
