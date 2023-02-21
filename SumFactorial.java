//Sum factorial of given number
import java.util.Scanner;
class SumFactorial
  {
  public static void main(String args[])
    {
    long n,sum=1;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Number");
      n=s.nextLong();
      //Loop
      while(n>=1)
        {
          //Calculations inside loop
          sum=sum*n;
          //System.out.print("\t"+sum);//print sum every time
          n--;
        }
      // Final Output
      System.out.println("Factorial is :"+sum);
    }
  }