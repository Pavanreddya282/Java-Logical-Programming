//Enven Number in N Natual
import java.util.Scanner;
class EvenNatural
  {
  public static void main(String args[])
    {
    int n,i=1;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Number");
      n=s.nextInt();
      
      while(i<=n)
        {
          if(i%2==0)
          {
          //i=i+1;
          System.out.print("\t"+i);
          }
          i++;   
      }
    } 
  }