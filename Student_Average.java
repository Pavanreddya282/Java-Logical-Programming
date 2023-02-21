
//Write a Java Program to Enter Student Number, Student Name, Any 3 Subject of Marks, Calculate Total and Average of the Student, and print the report?
import java.util.Scanner;

class Student_Average {
  public static void main(String[] args) {
    int snu;
    String sna;
    float maths;
    float kannada;
    float science;
    float ta, pm;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Student Number : ");
    snu = sc.nextInt();
    System.out.print("Enter Student Name : ");
    sna = sc.next();
    System.out.print("Enter marks in Maths : ");
    maths = sc.nextFloat();
    System.out.print("Enter marks in kannada : ");
    kannada = sc.nextFloat();
    System.out.print("Enter marks in science : ");
    science = sc.nextFloat();

    ta = maths + kannada + science;
    pm = ta / 3;
    System.out.println();
    System.out.println("The Total Marks is :" + ta);
    System.out.println("The Total Average is :" + pm);
  }
}