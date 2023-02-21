//Create a class that simulates a simple calculator, with methods for addition, subtraction, multiplication, and division.//

import java.util.Scanner;
class Operators{
  int a,b,c;
  char choice;
    void Maths() {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("CALCUALATOR");
    System.out.println();
    System.out.println("Choose the choice to perform operation");
    System.out.println("Choose '+' for Addition");
    System.out.println("Choose '-' for Substraction");
    System.out.println("Choose '*' for Multiplication");
    System.out.println("Choice '/' for Devision");

    System.out.println("Enter your choice :");
    choice = sc.next().charAt(0);
    if(choice=='+'||choice=='-'||choice=='*'||choice=='/')
    {
      System.out.println("Enter a and b values :");
      a = sc.nextInt();
      b = sc.nextInt();
    switch(choice)
    {
      case '+':
        c=a+b;
      System.out.println("Addition is "+c);
      break;
      case '-':
         c=a-b;
      System.out.println("Substraction is "+c);
      break;
      case '*':
         c=a*b;
      System.out.println("Multiplication is "+c);
      break;
      case '/':
         c=a/b;
      System.out.println("Division is "+c);
      break;
      default:
      System.out.println("Choose correct option");
    }
    } 
  }
}
class Arthmetics{
  public static void main(String args[]){
    Operators a = new Operators();
    a.Maths();
  }
}
    