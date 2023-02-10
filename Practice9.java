// WAP Check given number is odd or even
import java.util.Scanner;
class Practice9{
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    num=sc.nextInt();
    if(num%2==0){
      System.out.println("it is even number");
    }
    else{
      System.out.println("it is odd number");
    } 
  }
}