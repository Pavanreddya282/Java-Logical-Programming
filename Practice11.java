//WAP check given number is positive or negative
import java.util.Scanner;
class Practice11{
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    num=sc.nextInt();
    if(num>0){
      System.out.println("It is positive number");
    }
    else if(num<0){
      System.out.println("It is negative number");
    }
    else
      System.out.println("It is neither positive nor negative");
    }
  }