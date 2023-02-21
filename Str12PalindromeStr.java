import java.util.Scanner;

class Str12PalindromeStr {
  public static void main(String args[]) {
    String st1;
    String reverse = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    st1 = sc.next();
    String t = st1;
    for (int i = st1.length() - 1; i >= 0; i--) {
      //char ch = st1.charAt(i); use directly
      reverse = reverse + st1.charAt(i);
    }
    if (st1.equals(reverse)) {
      System.out.println("String is palindrome : ");
    } else 
      System.out.println("String is not palindrome : ");
  }
}