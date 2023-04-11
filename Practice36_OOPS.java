/*OOPS:-
Acc. to IT Standards the class that contains main method in it should not contain anything else. That is why every java source file will have minimum two classes in it. One for main method and other class for logic.

*/

import java.util.*;
class PrimeNumber
  {
    public static void isprime(int n)
    {
      
      int count=0;
      for(int i=1;i<=n;i++)
        {
          if(n%i==0)
            count++;
        }
      if(count==2)
      {
        System.out.println(n+" is a prime");
      }
      else
        System.out.println(n+" is not a prime");
    }
  }
class Practice36_OOPS
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      int n=sc.nextInt();
      PrimeNumber.isprime(n);
      /*PrimeNumber p=new PrimeNumber();
      p.isprime(n);*/
    }
  }