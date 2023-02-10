//1.Swap two  number using temp variable
//2.without temperory varaible
import java.util.Scanner;
class Practice4{
  public static void main(String args[]){
    int a,b;
    //int temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a and b value :");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Before swapping : "+a+""+b+"");
    //temp=a;
    //a=b;
    //b=temp;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping : "+a+""+b+"");
  }
}