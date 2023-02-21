// Count string length
import java.util.Scanner;

class Str10CountStrLngth {
  public static void main(String args[]) {
    String st1;
    int count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    st1 = sc.next();
    for (int i = 0; i < st1.length(); i++) {
      count++;
    }
    System.out.println("The string count is : " + count);
  }
}