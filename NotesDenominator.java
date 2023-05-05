package com.JavaPractice;

import java.util.Scanner;

public class NotesDenominator {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int notes[]= {2000,500,200,100,50,20,10,1}; // denominations of notes
		
		int[] noteCount= new int[10]; // array to store count of notes
		
		int amount, remainingAmount;
		
		System.out.println("Enter the amount");
		amount=sc.nextInt();
		sc.close();
		
		remainingAmount=amount;
		
		for(int i=0;i<notes.length;i++) {
			if(remainingAmount >= notes[i]) {
				noteCount[i]=remainingAmount/notes[i];
				remainingAmount=remainingAmount%notes[i];
			}
		}
		
		System.out.println("Total number of notes for the amount " + amount + " are:");
		
		for(int i=0;i<notes.length;i++) {
			if(noteCount[i]!=0) { // it only print noteCount !=0;
				System.out.println(notes[i] + " : " + noteCount[i]);
			}
		}
	}

}
