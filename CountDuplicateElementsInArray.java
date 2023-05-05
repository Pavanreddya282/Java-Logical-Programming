package com.JavaPractice;

import java.util.Scanner;

public class CountDuplicateElementsInArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements to array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int count=0;
		for(int i =0;i<n;i++) {
			int freq=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					freq++;
				}
			}
			if(freq>1) {
				count++;
				//System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\nTotal number of duplicate elements in the array: " + count);
	}

}
