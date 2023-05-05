package com.JavaPractice;

import java.util.Scanner;

public class CountNegetiveInArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter elements to array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		int count=0;
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				count++;
			}
		}
		System.out.println("Number of negetive elements in array are: "+count);
	}

}
