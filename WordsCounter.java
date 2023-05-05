package com.JavaPractice;

import java.util.Scanner;

public class WordsCounter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		sc.close();
		int wordCount=1;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
				wordCount++;
			}
		}
//		String words[]=str.split(" ");
//		
//		for(String word:words) {
//			if(!word.isEmpty())
//				wordCount++;
//		}
//		
		System.out.println("Total number of words: " + wordCount);
	}

}
