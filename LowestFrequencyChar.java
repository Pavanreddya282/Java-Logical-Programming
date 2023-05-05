package com.JavaPractice;

import java.util.Scanner;

public class LowestFrequencyChar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		
		sc.close();
		
		int freq[]= new int[1001];
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			freq[c]++;
		}
		int minFreq=Integer.MAX_VALUE;
		char lowChar=' ';
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0 && freq[i]<minFreq) {
				minFreq=freq[i];
				lowChar=(char) i;
			}
		}
		if (lowChar == 0) {
            System.out.println("No character found with minimum frequency");
        } else {
            System.out.println("The character with lowest frequency is: " + lowChar);
            System.out.println("Frequency of the character is: " + minFreq);
        }
	}

}
