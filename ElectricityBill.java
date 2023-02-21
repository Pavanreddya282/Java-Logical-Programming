//Write a Java Program to enter Consumer Number , Consumer Name , Present Month Reading, Last Month Reading, Calculate Total units & Electricity bill and print the report. Note: Cost per unit is 3.80

import java.util.Scanner;

class ElectricityBill {
  public static void main(String[] args) {
    int cnu;
    String cna;
    float pmr;
    float lmr;
    float tu, eb;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Consumer Number : ");
    cnu = sc.nextInt();
    System.out.print("Enter Consumer Name : ");
    cna = sc.next();
    System.out.print("Enter Present Month Reading : ");
    pmr = sc.nextFloat();
    System.out.print("Enter Last Month Reading : ");
    lmr = sc.nextFloat();
    tu = pmr - lmr;
    eb = tu * 3.80f;
    System.out.println();
    System.out.println("The Consumer Number is : " + cnu);
    System.out.println("The Consumer Name is : " + cna);
    System.out.println("The Present Month Reading is : " + pmr);
    System.out.println("The Last Month Reading is : " + lmr);
    System.out.println();
    System.out.println("The Total present month unit is : " + tu);
    System.out.println("The Electricity Bill Ammount is :" + eb);
  }
}