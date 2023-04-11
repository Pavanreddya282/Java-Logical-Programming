// Find the factorial of user defined number
import java.util.*;
class Practice34
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of number");
      int n=sc.nextInt();
      int fact=1;
      for(int i=n;i>=1;i--)
        {
          fact=fact*i;
        }
      System.out.println("The Factorial value of "+n+" is "+fact);
    }
  }