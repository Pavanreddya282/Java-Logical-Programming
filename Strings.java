package com.JavaPractice;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Find Length of String
		System.out.println("Enter the String");
		String str= sc.nextLine();
		System.out.println("The Length of a string is "+str.length());
		
		// Compare to Strings
		System.out.println("Enter the String one");
		String str1= sc.nextLine();
		System.out.println("Enter the String two");
		String str2= sc.nextLine();
		
		boolean isEqual=str1.equals(str2);
		
		if(isEqual) {
			System.out.println("Both the strings are Equal");
		}else
			System.out.println("Both strings are not Equal");
		
		// Concatenate two Strings
		System.out.println("Enter the String one");
		String s1= sc.nextLine();
		System.out.println("Enter the String two");
		String s2= sc.nextLine();
		
		String s3=s1+" "+s2;
		System.out.println("The Combination of two strings are: "+s3);
		
		sc.close();
	}

}
