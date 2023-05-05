package com.JavaPractice;

import java.util.Scanner;

public class NumberCheckFunctions {
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i =2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isArmstrong(int num) {
		int sum=0;
		int originalNum=num;
		while(num>0) {
			int digit=num%10;
			sum+=Math.pow(digit, 3);
			num/=10;
		}
		return sum == originalNum;
	}
	
	public static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        if(isPrime(num)) {
        	System.out.println(num + " is a prime number.");
        }else {
        	System.out.println(num + " is not a prime number.");
        }
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }
	}
}
