package com.JavaPractice;

import java.util.Scanner;

public class WhileReverseNatural {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=input.nextInt();
		input.close();
		int i=n;
		while(i>0) {
			System.out.println(i);
			i--;
		}
	}
}
