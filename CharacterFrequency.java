package com.JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		
		sc.close();
		
		Map<Character,Integer> freq= new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
		}
		
		System.out.println("Frequency of each character in the string:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}

}
