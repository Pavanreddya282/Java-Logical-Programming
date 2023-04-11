// WAP to check prime or not

import java.util.*;
class Practice32
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num =sc.nextInt();
      boolean flag=check(num);
      if(flag==true)
      {
        System.out.println(num+" is a prime");
      }
      else
        System.out.println(num+" is not a prime");
    }
    public static boolean check(int num)
    {
      int count=0;
      for (int i=1;i<=num;i++)
        {
          if(num%i==0)
            count++;
        }
      if(count==2)
      {
        return true;
      }
      else
        return false;
    }
  }
