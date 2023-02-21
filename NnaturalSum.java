//Sum of N natural numbers
import java.util.Scanner;
class NnaturalSum
  {
  public static void main(String args[])
    {
    int n,i=1,sum=0;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Number");
      n=s.nextInt();
      //Loop
      while(i<=n)
        {
          //Calculations inside loop
          sum=sum+i;
          //System.out.print("\t"+sum);//print sum every time
          i++;
        }
      // Final Output
      System.out.println("Sum is :"+sum);
    }
  }