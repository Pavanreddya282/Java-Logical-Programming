import java.util.Scanner;
class Factorial
  {
  public static void main(String args[])
    {
    long n,sum=1;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number");
      n=sc.nextLong();
      for(;n>0;n--)
        {
          sum=sum*n;
        }
      System.out.println("Factorial Sum is : "+sum);
    }
  }
