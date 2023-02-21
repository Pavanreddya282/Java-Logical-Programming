import java.util.Scanner;

class Bigger{
  public static void main(String args[]) {
    int a, b;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of a :");
    a = sc.nextInt();
    System.out.println("Enter the value of b :");
    b = sc.nextInt();
    if (a>b)
    {
    System.out.println("A is Big");
    }
    else
    {
      System.out.println("B is Big");
    }
  }
}