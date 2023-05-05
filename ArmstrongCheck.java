package com.JavaPractice;

import java.util.Scanner;

public class ArmstrongCheck {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=input.nextInt();
		
		input.close();
		int orginNum=num;
		int sum=0;
		int numDigits=String.valueOf(num).length();
		while(num>0) {
			int digit=num%10;
			sum+=Math.pow(digit,numDigits);
			//sum+=(digit*digit*digit);
			num/=10;
		}
		
		if(orginNum==sum)
			System.out.println(orginNum+" is Armstrong Number");
		else
			System.out.println(orginNum+" is not Armstrong Number");
	}

}
