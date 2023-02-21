import java.util.Scanner;

class Str5 {
  public static void main(String args[]) {
    String st1;
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    st1 = sc.next();
    System.out.println("Enter the substring position to print from");
    n = sc.nextInt();
    System.out.println("The position of charecter is : " + st1.substring(n));
  }
}