import java.util.Scanner;
class Swapping {
  public static void main(String args[]) {
    int a, b, t;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value a :");
    a = sc.nextInt();
    System.out.println("Enter the value b :");
    b = sc.nextInt();
    System.out.println("Before Swapping "+a+" "+b);
    t=a;
    a=b;
    b=t;
    System.out.println("After Swapping "+a+" "+b);
    System.out.println();
  }
}