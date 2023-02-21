import java.util.Scanner;

class Add {
  public static void main(String args[]) {
    int a, b;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value1 :");
    a = sc.nextInt();
    System.out.println("Enter the value2 :");
    b = sc.nextInt();
    System.out.println("The given value of a is : " + a);
    System.out.println("The given value of b is : " + b);
    System.out.println("The addition of " + a + " and " + b + " is : " + (a + b));
  }
}
