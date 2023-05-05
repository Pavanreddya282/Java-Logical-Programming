package com.JavaPractice;

public class CopyArrayToArray {
	public static void main(String[] args) {
		
		int arr1[]= {2, 8, 2, 6};
		
		int arr2[]= new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.print("Array 2: ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
