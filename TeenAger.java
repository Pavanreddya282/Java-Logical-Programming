import java.util.Scanner;

class TeenAger{
  public static void main(String args[]) {
    int age;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter age :");
    age = sc.nextInt();
    
    if (age>=13)
    {
      if (age<=19)
      {
        System.out.println("Teen");
      }
        else
      {
        System.out.println("Adult");
      }
    }
      else
      {
        if(age>=20)
          System.out.println("Adult");
      }
  }
}
