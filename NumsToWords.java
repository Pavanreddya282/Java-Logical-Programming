package com.JavaPractice;

import java.util.Scanner;

public class NumsToWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        input.close();

        if (num < 0 || num > 9999) {
            System.out.println("Invalid input! Number should be between 0 and 9999");
            System.exit(0);
        }

        if (num == 0) {
            System.out.println("zero");
            System.exit(0);
        }

        String result = "";

        if (num / 1000 > 0) {
            result = result + ones[num / 1000] + " thousand ";
            num %= 1000;
        }

        if (num / 100 > 0) {
            result += ones[num / 100] + " hundred ";
            num %= 100;
        }

        if (num >= 20) {
            result += tens[num / 10] + " ";
            num %= 10;
        }

        if (num > 0) {
            result += ones[num] + " ";
        }

        System.out.println("Number in words: " + result.trim());
    }
}

