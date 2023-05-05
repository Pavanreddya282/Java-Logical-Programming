package com.JavaPractice;

import java.util.Scanner;

public class CountEvenOddArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the elements to an array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		int ecount=0;
		int ocount=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				ecount++;
			}
//			if(a[i]%2!=0) {
//				ocount++;
//			}
			else
				ocount++;
		}
//		int ocu=a.length-ecount;
		System.out.println("The Even count is "+ecount);
		//System.out.println("The Odd count is "+ocu);
		System.out.println("The Odd count is "+ocount);
	}

}
