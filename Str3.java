import java.util.Scanner;
class Str3{
  public static void main(String args[]){
    String st1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    st1=sc.next();
    System.out.println("The charecter position specified is : "+st1.charAt(4));
  }
}