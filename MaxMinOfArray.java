package com.JavaPractice;

import java.util.Scanner;

public class MaxMinOfArray {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the elemnts to array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		int min=arr[0],max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The Minimum Element in array is "+min);
		System.out.println("The Minimum Element in array is "+max);
	}

}
