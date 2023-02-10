//WAP to check given character is vowel or consonent
import java.util.Scanner;
class Practice12{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the letter in alphabet");
    ch=sc.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
      System.out.println("It is Vowel");
    }
      else{
      System.out.println("It is consonent");
      }
  }
}