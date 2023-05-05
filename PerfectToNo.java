package com.JavaPractice;

import java.util.Scanner;

public class PerfectToNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Maximum Limit");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			
			if(sum==i) {
				System.out.println(i+" ");
			}
		}
	}

}
