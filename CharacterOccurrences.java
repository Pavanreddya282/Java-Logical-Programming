package com.JavaPractice;

import java.util.Scanner;

public class CharacterOccurrences {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.next();
		
		System.out.println("Enter the charecter to serach");
		char ch=sc.next().charAt(0);
		sc.close();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
				System.out.println("Character " + ch + " found at index " + i);
			}
		}
		if (count == 0) {
            System.out.println("Character " + ch + " not found in the string.");
        } else {
            System.out.println("Total occurrences of character " + ch + " in the string is " + count + ".");
        }
	}
}
