/*
 * A strong number is a number whose sum of the factorial of its digits is equal to the number itself. 
 * For example, 145 is a strong number as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 */

package com.JavaPractice;

import java.util.Scanner;

public class StrongNoCheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Maximum Number");
		int n = sc.nextInt();
		
		sc.close();
		
		int sum=0;
		int temp=n;
		while(temp!=0) { // 145, 14, 1
			int result=1; // result is 1
			int digit=temp%10; // first digit 5, next 4, next 1
			for(int j=digit;j>0;j--) {
				result*=j; // 5 factorial 120, 4 factorial 24, 1 factorial 1.
			}
			sum+=result; // 120+24+1 = 145
			temp/=10; // 14, 1, 0 exit
		}
		if(n==sum) {
			System.out.println(n+" is a strong number");
		}else {
			System.out.println(n+" is not a strong number");
		}
	}
}
