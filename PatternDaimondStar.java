package com.JavaPractice;

public class PatternDaimondStar {
	
	public static void main(String[] args) {
		
        int n = 5;
        for (int i = 1; i <= n; i++) { //1
            for (int j = 1; j <= n-i; j++) { //4
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { //1
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
