import java.util.Scanner;

class Str4 {
  public static void main(String args[]) {
    String st1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    st1 = sc.next();
    System.out.println("Enter the charecter for position");
    char c = sc.next().charAt(0);
    System.out.println("The position of charecter is : " + st1.indexOf(c));
  }
}