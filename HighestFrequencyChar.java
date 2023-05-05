package com.JavaPractice;

import java.util.Scanner;

public class HighestFrequencyChar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		
		sc.close();
		
		int freq[]= new int[1001];
		for(int i=0;i<str.length();i++) {
			freq[str.charAt(i)]++;
		}
		
		int maxFreq=0;
		char highChar=' ';
		for(int i=0;i<1001;i++) {
			if(freq[i]>maxFreq) {
				maxFreq=freq[i];
				highChar=(char)i;
			}
		}
		System.out.println("The highest frequency character is: " + highChar);
        System.out.println("It occurs " + maxFreq + " times.");
	}

}
