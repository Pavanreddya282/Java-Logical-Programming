import java.util.Scanner;
class Str8 {
  public static void main(String args[]) {
    String st1,st2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    st1 = sc.next();
    System.out.println("Enter the string");
    st2 = sc.next();
    System.out.println("The string output is : "+st1.equals(st2));
    if(st1.equalsIgnoreCase(st2)){
      
      System.out.println("Both strings are equal");
    }
    else
      System.out.println("Both strings are not equal");
  }
}