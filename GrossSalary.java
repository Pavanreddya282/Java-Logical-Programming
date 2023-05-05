package com.JavaPractice;

import java.util.Scanner;

public class GrossSalary {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		float basicSalary,grossSalary;
		double HRA,DA;
		
		System.out.println("Enter basic JAVA Salary: ");
		basicSalary=sc.nextFloat();
		sc.close();
		
		if(basicSalary<=10000) {
			HRA=0.2;
			DA=0.8;
		}
		else if(basicSalary<=20000) {
			HRA=0.25;
			DA=0.9;
		}else {
			HRA=0.3;
			DA=0.95;
		}
		grossSalary=basicSalary+(float)(basicSalary*HRA)+(float)(basicSalary*DA);
		
		System.out.println("Basic JAVA salary: " + basicSalary);
        System.out.println("HRA: " + HRA * 100 + "%");
        System.out.println("DA: " + DA * 100 + "%");
        System.out.println("Gross salary: " + grossSalary);
	}
}
