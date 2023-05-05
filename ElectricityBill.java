/*
 * Write a JAVAprogram to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit */


package com.JavaPractice;

import java.util.Scanner;

public class ElectricityBill {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		double units;
		double ammount;
		
		System.out.println("Enter the units");
		units=sc.nextDouble();
		sc.close();
		
		if (units<=50) {
			ammount=0.5*units;
			
		}
		else if(units<=150) {
			ammount=(0.5*50)+((units-50)*0.75);
			
		}else if(units<=250) {
			ammount=(0.5*50)+(0.75*100)+((units-150)*0.75);
			
		}else
			ammount=(0.5*50)+(0.75*100)+(1.20*100)+((units-250)*1.50);
		
		double billAmmount=ammount+(ammount*0.2);
		
		System.out.println("Total Bill Ammount : "+billAmmount);
	}

}
