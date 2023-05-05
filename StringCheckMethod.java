package com.JavaPractice;

import java.util.Scanner;

public class StringCheckMethod {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		int alphabetCount = 0, digitCount = 0, specialCharCount = 0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isAlphabetic(ch)) {
				alphabetCount++;
			}
			else if(Character.isDigit(ch)) {
				digitCount++;
			}else {
				specialCharCount++;
			}
		}
		System.out.println("The Total Number of Alphabets are: "+alphabetCount);
		System.out.println("The Total Number of Digits are: "+digitCount);
		System.out.println("The Total Number of Special Characters are: "+specialCharCount);
		
		sc.close();
	}

}
