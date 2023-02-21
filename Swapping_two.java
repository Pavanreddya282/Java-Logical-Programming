import java.util.Scanner;

class Swapping_two {
  public static void main(String args[]) {
    int a, b;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value a :");
    a = sc.nextInt();
    System.out.println("Enter the value b :");
    b = sc.nextInt();
    System.out.println("Before Swapping " + a + " " + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After Swapping " + a + " " + b);
    System.out.println();
  }
}