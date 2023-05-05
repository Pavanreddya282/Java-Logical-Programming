package com.JavaPractice;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.next();
		sc.close();
		String str1=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str1.equals(rev)) {
			System.out.println(str+" is "+rev);
		}else
			System.out.println(str+ "It is not a Palindrome");
	}
}
