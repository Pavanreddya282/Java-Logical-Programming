import java.util.*;

class EqualLogical{
  public static void main(String args[]) {
    char w;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the letter :");
    w = sc.next().charAt(0);
    
    
    if (w=='a' || w=='e' || w=='i' || w=='o' || w=='u')
    
    System.out.println("It is vowel");
    
    else
    
      System.out.println("It is consonant");
    
  }
}