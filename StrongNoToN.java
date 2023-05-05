package com.JavaPractice;

import java.util.Scanner;

public class StrongNoToN {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Maximum Number");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Strong numbers between 1 and " + n + " are: ");
		for(int i=1;i<=n;i++) {
			int temp=i;
			int sum=0;
			while(temp!=0) {
				int digit=temp%10;
				
				sum+=fact(digit);
				temp/=10;
			}
			if (sum == i) {
                System.out.print(i + " ");
            }
		}
	}
	public static int fact(int n) {
		int f=1;
		for(int j=1;j<=n;j++) {
			f*=j;
		}
		return f;
	}

}
