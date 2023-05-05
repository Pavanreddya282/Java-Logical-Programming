package com.JavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		
		int a[]= new int[n];
		System.out.println("Enter the elements to array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("The Elements in array are: "+Arrays.toString(a));
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" Position "+i);
		}
		System.out.println("Enter the position of element to delete");
		int pos=sc.nextInt();
		
		for(int i=pos;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		
		int newa[]=new int[a.length-1];
		for(int i=0;i<a.length-1;i++) {
			newa[i]=a[i];
		}
		System.out.print("New Array after deleting element at position "+pos+": " + Arrays.toString(newa));
		
		sc.close();
	}

}
