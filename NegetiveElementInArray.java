package com.JavaPractice;

import java.util.Scanner;

public class NegetiveElementInArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter elements to array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("The negetive elements in array are: ");
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<0) {
				System.out.print(" "+arr[i]);
			}
		}
	}

}
