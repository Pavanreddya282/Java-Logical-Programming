import java.util.Scanner;

class Addition {
  int a, b, c;

  void add() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of a :");
    a = sc.nextInt();
    System.out.println("Enter the value of b :");
    b = sc.nextInt();

    c = a + b;
    System.out.println();
    System.out.println("The value of a is : " + a);
    System.out.println("The value of b is : " + b);
    System.out.println("The addition of " + a + " and " + b + " is : " + c);
  }
}

class Calculate {
  public static void main(String args[]) {
    Addition a1 = new Addition();
    a1.add();
  }
}
