
// checking given ovel or not
import java.util.Scanner;
  class Alpha
  {
    void Check(char l)
    {
      switch(l)
    {
        case 'a': case'A':
        case 'e': case'E':
        case 'i': case'I':
        case 'o': case'O':
        case 'u': case'U':
      System.out.println("It is vowel");
      break;
      default:
      System.out.println("It is consonent");
    }
    }
  }
class VowelConso
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      char l;
      Alpha l1= new Alpha();
      System.out.println("Enter a letter in alphabet");
      l=sc.next().charAt(0);
      l1.Check(l);
    }
  }