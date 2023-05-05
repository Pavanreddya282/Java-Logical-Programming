/*
 * Factors of a number are the positive integers that divide the given number without leaving any remainder.
 *  For example, the factors of 12 are 1, 2, 3, 4, 6, and 12, as they divide 12 without leaving any remainder.
 *  */


package com.JavaPractice;

import java.util.Scanner;

public class FactorsNum {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=input.nextInt();
		
		input.close();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i+" ");
			}
		}
	}

}
