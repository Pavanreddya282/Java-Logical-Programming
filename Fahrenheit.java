//Create a program that converts Fahrenheit to Celsius using the formula (C = (F - 32) * 5/9). Ask the user to input a temperature in Fahrenheit.Declare a double variable to store the Fahrenheit value.Use the variable to calculate the equivalent temperature in Celsius and store the result in a double variable.Print the result.

import java.util.Scanner;

class Fahrenheit {
  public static void main(String[] args) {

    double F;
    double C;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temperature in Fahrenheit : ");
    F = sc.nextDouble();
    C = (F - 32) * 5/9;

    System.out.println();
    System.out.println("The temperature in Fahrenheit is : " + F);
    System.out.println("The temperature in celsius is : " + C);
  }
}