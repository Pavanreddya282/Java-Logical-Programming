// Print N natural numbers
import java.util.Scanner;
class Nnatural
  {
  public static void main(String args[])
    {
    int n,i=1;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Number");
      n=s.nextInt();
      
      while(i<=n)
        {
          System.out.print("\t" +i);
          i++;
        }
    }
  
  }