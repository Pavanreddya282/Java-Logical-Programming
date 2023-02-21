import java.util.Scanner;
class Str7 {
  public static void main(String args[]) {
    String st1,st2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    st1 = sc.next();
    System.out.println("Enter the string");
    st2 = sc.next();
    if(st1.equals(st2)){
      System.out.println("Both strings are equal");
    }
    else
      System.out.println("Both strings are not equal");
  }
}