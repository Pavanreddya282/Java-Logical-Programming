import java.util.Scanner;
class Practice5{
  public static void main(String args[]){
    int n1,n2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers : ");
    n1=sc.nextInt();
    n2=sc.nextInt();
    System.out.println("\nAddition of numbers is : "+(n1+n2));
    System.out.println("Substraction of numbers is : "+(n1-n2));
    System.out.println("Multiplication of numbers is : "+(n1*n2));
    System.out.println("Division of numbers is : "+(n1/n2));
    System.out.println("Modulous of numbers is : "+(n1%n2));
  }
}
