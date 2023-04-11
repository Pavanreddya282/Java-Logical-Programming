/*Scanner:- Use Scanner class to take input from the user
To import:- import java.util.Scanner;
To define object:- Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
double d=sc.nextDouble();
float c=sc.nextFloat();
boolean d=sc.nextBoolean
char e=sc.next().charAt(0);
String s1=sc.next();
String s2=sc.nextLine();
*/
//WAP to check if given charecter is vowel or consonent (using methods and by taking i/p from user)
import java.util.Scanner;
class Practice31Scanner
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Eneter a char value");
      char ch=sc.next().charAt(0);
      int Letter=logic(ch);
        if (Letter==1)
      {
        System.out.println(ch+ " is vowel");
      }
      else
        System.out.println(ch+ " is consonent");
    }
    public static int logic(char ch)
    {
      if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
        return 1;
      }
      else
         return 0;
    }
  }