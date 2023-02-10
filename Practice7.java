//if: it executes only when condition is true
/*if-else: "if" executes when codition is true
"else" executes when codition is false*/
import java.util.Scanner;
class Practice7{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int marks;
    System.out.println("Enter the student marks");
    marks=sc.nextInt();
    System.out.println("\nHi");
    if(marks>=35){
      System.out.println("\nYou are a rockstar");
    }
    /*if(marks>=35){
      System.out.println("\nYou are a rockstar");
    }
    else{
      System.out.println("\nYou got less");
    }*/
    System.out.println("\nGood bye!!");
  }
}