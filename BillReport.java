// Write a Program to Enter Product Number, Product Name, Product Cost, Product Quantity, calculate Bill Amount and print the report?
import java.util.Scanner;

class BillReport {
  public static void main(String[] args) {
    int pnu;
    String pna;
    float pcost;
    float pqty;
    float Ba;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Product Number : ");
    pnu = sc.nextInt();
    System.out.print("Enter Product Name : ");
    pna = sc.next();
    System.out.print("Enter Product Cost : ");
    pcost = sc.nextFloat();
    System.out.print("Enter Product Quantity : ");
    pqty = sc.nextFloat();

    Ba = pcost*pqty;
    System.out.println("The Product Number is : " +pnu);
    System.out.println("The Product Name is : " +pna);
    System.out.println("The Product Cost is : " +pcost);
    System.out.println("The Product Quantity is : " +pcost);
    System.out.println("The Total Bill Ammount is :" +Ba);
  }
}