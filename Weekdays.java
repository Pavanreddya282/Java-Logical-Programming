import java.util.Scanner;

class Weekdays{
  public static void main(String args[]) {
    int num;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Number to show weekday :");
    num = sc.nextInt();
    
    if (num==1)
    {
      System.out.println("Sunday");
    }
    else if (num==2)
    {
      System.out.println("Monday");
    }
    else if (num == 3)
    {
      System.out.println("Tuesday");
    }
    else if (num == 4)
    {
      System.out.println("Wednesday");
    }
    else if (num == 5)
    {
      System.out.println("Thursday");
    }
    else if (num == 6)
    {
      System.out.println("Friday");
    }
    else if (num == 7)
    {
      System.out.println("Saturday");
    }
    else
    {
      System.out.println("Only 7 days in a week!!");
    }
  }
}
