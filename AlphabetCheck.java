package com.JavaPractice;

import java.util.Scanner;

public class AlphabetCheck {

public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		sc.close();
		
		if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')) {
			
			System.out.println("It is Alphabet");
		}
		else if(ch>='0'&& ch<='9') {
			System.out.println("It is digit");
		}
			else
				System.out.println("It is special Charecter");
	}
}
