package com.JavaPractice;

import java.util.Scanner;

public class ArmstrongToN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Maximum Limit");
		int num = sc.nextInt();
		sc.close();
		for(int i=1;i<=num;i++) {
			int temp=i;
			int sum=0;
			int digits=0;
			
			while(temp>0) {
				digits++;
				temp/=10;
			}
			temp = i;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
			if(sum==i)
				System.out.print(i+" ");
		}
	}

}
