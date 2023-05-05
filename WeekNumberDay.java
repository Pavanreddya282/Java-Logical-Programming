package com.JavaPractice;

import java.util.*;
public class WeekNumberDay {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the weekday Number (1-7)");
		int wdnum=sc.nextInt();
		sc.close();
		String day="";
		
		switch(wdnum) {
		case 1:
			day="Monday";
			break;
			
		case 2:
			day="Tuesday";
			break;
			
		case 3:
			day="Wednesday";
			break;
			
		case 4:
			day="Thursday";
			break;
			
		case 5:
			day="Friday";
			break;
			
		case 6:
			day="Saturday";
			break;
			
		case 7:
			day="Sunday";
			break;
			
			default:
				System.out.println("Invalid WeekDayNumber");
		}
		
		System.out.println("Week day for week number " + wdnum + " is " + day + ".");
	}

}
