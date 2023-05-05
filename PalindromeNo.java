package com.JavaPractice;

import java.util.Scanner;

public class PalindromeNo {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		sc.close();
		
		int originalNum=num;
		int tempNum=0;
		
		while(num!=0) {
			int remnum=num%10;
			tempNum=tempNum*10+remnum;
			num/=10;
		}
		if(originalNum==tempNum) {
			System.out.println("It is Palindrome No.");
		}else
			System.out.println("It is not a Palindrome No.");
	}

}
