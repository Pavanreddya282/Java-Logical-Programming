//The nested if statement in Java is a set of if conditions one within another. The inner if conditions are only executed when the outer if condition results in true; otherwise the corresponding else block is executed.
/*Syntax
if(Condition1)       // Outer if condition satisfies go to inner
{
  if(condition2)    // Inner if condition
  {
  Statements;
  }
  else             // Inner else condition
  {
  Statements;
  }
}
else              // Outer if condition not satisfied else is executed
{
Statements;
}
/* WAP to check given number is +ve or -ve if number is
negative print negative number. If number is psoitive or
equal to zero perform below operations
even print even number
odd print odd number*/

import java.util.Scanner;
class Practice13{
  public static void main(String args[]){
    int num;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number");
    num=sc.nextInt();
    if(num>=0){
      if(num%2==0){
        System.out.println("Even Number");
      }
      else
        System.out.println("Odd Number");
    }
    else{
      System.out.println("It is negative number");
    }
  }
}