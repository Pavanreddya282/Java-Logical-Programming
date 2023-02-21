import java.util.Scanner;
class Char {
  public static void main(String args[]) {
    char ch;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter character value  :");
    ch = sc.next().charAt(0);
    System.out.println("The given character is : "+ch);
      }
}