package com.JavaPractice;

import java.util.Scanner;

public class FrequencyDigit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		long num= sc.nextLong();
		sc.close();
		
		long[] freq =new long[15];
		
		while(num!=0) {
			int digit =(int) (num%10);
			freq[digit]++;
			num/=10;
		}
		
		for(int i=0;i<15;i++) {
			
			if(freq[i]>0)
			System.out.println(i+ " Occurs "+freq[i]+" times");
		}
		
	}

}
