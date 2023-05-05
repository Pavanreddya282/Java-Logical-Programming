package com.JavaPractice;

public class MaxThreeNumbers {
	
	public static void main(String a[]) {
		int num1=43;
		int num2=46;
		int num3=50;
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is Maximum");
			
		}
		else if(num2>num3) {
			System.out.println(num2+" is Maximum");
		}
		else
			System.out.println(num3+" is Maximum");
	}

}
