import java.util.Scanner;
class MultiTables
  {
  public static void main(String args[])
    {
    int n,i=1,m;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Number");
      n=s.nextInt();
      
      while(i<=10)
        {
          m=n*i;
          System.out.println(n + " X " + i + " = "+ m);
          i++;
          }
             
      }
    } 