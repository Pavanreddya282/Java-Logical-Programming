
// given number is prime or not
import java.util.Scanner;

class PrimeCheck {
  public static void main(String args[]) {
    int n, i = 1, c = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the Number");
    n = s.nextInt();

    while (i <= n) {
      if (n % i == 0) {
        c++;
      }
      i++;
    }
    if (c == 2)
      System.out.print("Prime Number");
    else
      System.out.print("Not Prime Number");
  }
}