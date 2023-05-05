package com.JavaPractice;

import java.util.Scanner;

public class FactorialNum {
	
	public static void main(String[] args) {
		
Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=input.nextInt();
		
		input.close();
		int result=1;
		
		for(int i=num;i>0;i--) {
			
			result*=i;
		}
		System.out.println(result);
	}

}
