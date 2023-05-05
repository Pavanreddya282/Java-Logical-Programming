package com.JavaPractice;

import java.util.*;

public class MaxTwoNumbers {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the two numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		sc.close();
		
		if(num1>num2)
			System.out.println(num1+" is maximum");
		else
			System.out.println(num2+" is maximum");
	}

}
