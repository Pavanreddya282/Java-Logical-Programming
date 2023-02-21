import java.util.Scanner;

class Calculator{
  public static void main(String args[]) {
    int a,b,c,choice;
    Scanner sc = new Scanner(System.in);
    System.out.println("CALCUALATOR");
    System.out.println();
    System.out.println("Choose the choice to perform operation");
    System.out.println("Choice 1 Addition");
    System.out.println("Choice 2 Substraction");
    System.out.println("Choice 3 Multiplication");
    System.out.println("Choice 4 Devision");
    System.out.println("Choice 5 Modulous");

    System.out.println("Enter your choice :");
    choice = sc.nextInt();
    if(choice<6)
    {
      System.out.println("Enter a and b values :");
      a = sc.nextInt();
      b = sc.nextInt();
    switch(choice)
    {
      case 1:
        c=a+b;
      System.out.println("Addition is "+c);
      break;
      case 2:
         c=a-b;
      System.out.println("Substraction is "+c);
      break;
      case 3:
         c=a*b;
      System.out.println("Multiplication is "+c);
      break;
      case 4:
         c=a/b;
      System.out.println("Division is "+c);
      break;
      case 5:
         c=a%b;
      System.out.println("Modulous Remainder is "+c);
      break;
      default:
      System.out.println("Choose between 1 and 5");
    }
    }
  }
}
