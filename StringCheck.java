package com.JavaPractice;

import java.util.Scanner;

public class StringCheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		sc.close();
		
		int alphabetCount=0;
		int digitCount=0;
		int specialCharCount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
				alphabetCount++;
			}
			else if(ch>='0'&&ch<='9') {
				digitCount++;
			}else
				specialCharCount++;
		}
		
		System.out.println("The Total Number of Alphabets are: "+alphabetCount);
		System.out.println("The Total Number of Digits are: "+digitCount);
		System.out.println("The Total Number of Special Characters are: "+specialCharCount);
	}

}
