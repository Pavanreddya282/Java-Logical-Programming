import java.util.Scanner;

class OvelConsonent{
  public static void main(String args[]) {
    char l;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter letter in alphabet:");
    l = sc.next().charAt(0);
    
    if (l=='a'|| l== 'A')
    {
      System.out.println("It is a Vowel");
    }
    else if (l=='e'|| l== 'E')
    {
      System.out.println("It is a Vowel");
    }
    else if (l=='i'|| l== 'I')
    {
      System.out.println("It is a Vowel");
    }
    else if (l=='o'|| l== 'O')
    {
      System.out.println("It is a Vowel");
    }
    else if (l=='u'|| l== 'U')
    {
      System.out.println("It is a Vowel");
    }
    else
    {
      System.out.println("It is a Consonent");
    }
  }
}
