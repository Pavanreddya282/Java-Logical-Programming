// WAP biggest of two numbers
import java.util.Scanner;
class Practice10{
  public static void main(String args[]){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    if(a>b){
      System.out.println("a value is big");
    }
    else if (b>a){
      System.out.println("b value is big");
    }
    else
      System.out.println("a is equal to b");
  }
}