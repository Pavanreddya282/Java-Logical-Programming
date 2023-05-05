/*
 * Fibonacci series is a series of numbers where each number in the series is the sum of the two preceding numbers.
 *  The first two numbers of the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 */
package com.JavaPractice;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the maximum Fibonacci Series");
		int n=sc.nextInt();	
		sc.close();
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<n;i++) {// i=1,2,3,4
			System.out.print(a+" "); //0, 1, 1, 2
			c=a+b; // c=1, c=2, c=3, c=5
			a=b; // a=1, a=1, a=2, a=3
			b=c; // b=1, b=2, b=3, b=5
		}
	}

}
