import java.util.*;
class Eh1
  {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    void divide()
    {
      try
        {
        System.out.println("Enter a,b values");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
        System.out.println("The Devision is"+c);
        }
      catch(ArithmeticException ae)
        {
          System.out.println("The Exception Occur");
          System.out.println("The Exception Occur"+ae);
          System.out.println("The Exception Occur"+ae.getMessage());
        }
    }
    public static void main(String args[])
    {
      Eh1 a=new Eh1();
      a.divide();
    }
  }