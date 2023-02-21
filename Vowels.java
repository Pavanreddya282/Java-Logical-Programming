import java.util.Scanner;

class Vowels{
  public static void main(String args[]) {
    char l;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter any letter in alphabet :");
    l = sc.next().charAt(0);
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
