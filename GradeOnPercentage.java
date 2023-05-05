package com.JavaPractice;

import java.util.Scanner;

public class GradeOnPercentage {
	
	public static void main(String a[]) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the marks:");
		
		System.out.println(" Physics :");
		int phy=sc.nextInt();
		
		System.out.println(" Chemistry :");
		int che=sc.nextInt();
		
		System.out.println(" Biology :");
		int bio=sc.nextInt();
		
		System.out.println(" Mathematics :");
		int mth=sc.nextInt();
		
		System.out.println(" Computer :");
		int com=sc.nextInt();
		sc.close();
		
		int avg=phy+che+bio+mth+com/5;
		
		double totalMarks=phy+che+bio+mth+com;
		
		double percentage=(totalMarks/500)*100;
		
		System.out.println("Average: "+avg);
		
		System.out.println("Percentage: " + percentage + "%");
		
		int grade;
		
		switch((int)percentage/10)
		{
		case 10:
		case 9:
			grade='A';
			//System.out.println("Grade A");
			break;
		case 8:
			grade='B';
			//System.out.println("Grade B");
			break;
		case 7:
			grade='C';
			//System.out.println("Grade C");
			break;
		case 6:
			grade='D';
			//System.out.println("Grade D");
			break;
		case 5:
		case 4:
			grade='E';
			//System.out.println("Grade E");
			break;
			
			default:
				grade='F';
				//System.out.println("Grade F");
				break;
		}
		System.out.println("Grade: " + (char) grade);
	}

}
