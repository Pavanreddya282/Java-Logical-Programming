package com.JavaPractice;

import java.util.Scanner;

public class VowelsAndConsonents {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		sc.close();
		int vowels=0;
		int consonents=0;
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}else if(ch>='a'&& ch<='z') {
				consonents++;
			}
		}
		System.out.println("Number of Vowels: "+vowels);
		System.out.println("Number of Consonents: "+consonents);
	}
}
