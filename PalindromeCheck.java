package com.JavaPractice;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.next();
		sc.close();
		
		if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
	}
	
	private static boolean isPalindrome(String str) {
		int len=str.length();
		
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) {
				return false;
			}
		}
		return true;
	}
}
