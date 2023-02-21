import java.util.Scanner;

class BiggerThree{
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
    {
      if (a>c)
      {
        System.out.println("A is Big");
      }
        else
      {
        System.out.println("C is Big");
      }
    }
      else
      {
        if(b>c)
          System.out.println("B is Big");
        else
          System.out.println("C is Big");
      }
  }
}
