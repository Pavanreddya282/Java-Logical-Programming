
//Find the factors of user defined number
/*
import java.util.*;
class Practice35
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          if(n%i==0)
            System.out.print("\t"+i);
        }
    }
  }
*/
// Print Even number between 1 and user defined number
/*
import java.util.*;
class Practice35
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          if(i%2==0)
            System.out.print("\t"+i);
        }
    }
  }
*/
// Count Odd number between 1 and user defined number
import java.util.*;

class Practice35 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value");
    int n = sc.nextInt();
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1)
        count++;
    }
    System.out.print(count);
  }
}