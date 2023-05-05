package com.JavaPractice;

import java.util.Scanner;

public class LastOccurChar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.next();
		
		System.out.println("Enter the charecter to serach");
		char ch=sc.next().charAt(0);
		sc.close();
		
		int lastIndex=str.lastIndexOf(ch);
		if (lastIndex == -1) {
            System.out.println("Character not found in string");
        } else {
            System.out.println("Last occurrence of " + ch + " is at index " + lastIndex);
        }
	}

}
