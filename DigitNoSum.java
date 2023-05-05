package com.JavaPractice;

import java.util.Scanner;

public class DigitNoSum {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num =sc.nextInt();
		sc.close();
		int sum=0;
		//for(int i=0;i<=num;i++) { //for bigger number with more than 6 digit its not working
		while(num!=0){
			int digit=num%10;
			sum+=digit;
			num=num/10;
		}
		
		System.out.println("The Sum of digits of a Number: "+sum);
	}

}
