//to check the given number is EVEN or ODD using switch case 
import java.util.Scanner;

class EvenOdd
{
  public static void main(String args[]) 
  {
    int n,a;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter any number :");
    n = sc.nextInt();
    
    switch(n%2)
    {
     case 0:
     System.out.println("It is Even");
     break;
     case 1:
     System.out.println("It is Odd");
     break;   
     default:
     System.out.println("Only positive number");
    }
  }
}
