package com.JavaPractice;

import java.util.Scanner;

public class ASCII {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		char ch = (char)num;
		sc.close();
		System.out.println("ASCII value of "+num+" is "+ch);
		
//		 for(int i=0; i<=127; i++) {
//	           System.out.println("ASCII value of " + (char)i + " is " + i);
//	       }
	}

}
