package com.JavaPractice;

import java.util.Scanner;

public class FirstOcurrChar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.next();
		
		System.out.println("Enter the charecter to serach");
		char search=sc.next().charAt(0);
		sc.close();
		int index=-1;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==search) {
				index=i;
			}
		}
		if(index!=-1) {
			System.out.println("The first occurrence of " + search + " is at index " + index + " in the string.");
		}else {
			System.out.println(search + " is not present in the string.");
		}
	}

}
