/*power of every even number square root for odd number from o to n*/
import java.util.Scanner;
class Number
  {
    int power,square;
    void Numb(int n)
    {
      if(n%2==0)
      {
        power = n*n;
        System.out.println("The power of number is "+power);
      }
      else if(n%2==1)
      {
        square = n*n;
      System.out.println("The square of number is "+square);
      }
      else 
      System.out.println("Enter the positive number");
    }
    }
    /*void Odd(int n)
    {
      if(n%2==1)
        square = n*2;
      System.out.println("The square of number is "+square); 
    }*/
class EvenOdd
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n;
      Number n1 = new Number();
      System.out.println("Enter the Number");
      n = sc.nextInt();
      n1.Numb(n);
      //n1.Odd(n);
    }
  }
  