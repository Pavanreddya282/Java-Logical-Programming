package com.JavaPractice;

import java.util.Scanner;

public class UniqueElementsArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter elements to array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.print("Unique elements in the array are: ");
		
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					
				}
			}
			if(count==1) {
				 System.out.print(arr[i] + " ");
			}
		}
	}

}
