package com.JavaPractice;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to get Multiplication Table :");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+" = "+(i*n));
		}
	}

}
