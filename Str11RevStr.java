//reverse of string
import java.util.Scanner;

class Str11RevStr {
  public static void main(String args[]) {
    String st1;
    String reverse="";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    st1 = sc.next();
    for (int i = st1.length()-1; i >=0; i--) {
      char ch= st1.charAt(i);
      reverse=reverse+ch;
    }
    System.out.println("The reverse of string is : " + reverse);
  }
}