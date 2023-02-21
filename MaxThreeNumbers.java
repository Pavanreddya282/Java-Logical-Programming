import java.util.Scanner;

class MaxThreeNumbers{
  public static void main(String args[]) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of a :");
    a = sc.nextInt();
    System.out.println("Enter the value of b :");
    b = sc.nextInt();
    System.out.println("Enter the value of c :");
    c = sc.nextInt();
    
    if (a>b)
      if (b>c)
    {
      System.out.println("A is Big");
    }
    if (b>a)
      if (a>c)
    {
      System.out.println("B is Big");
    }
      System.out.println("C is Big");
    }
  }