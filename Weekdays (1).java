import java.util.Scanner;

class Weekdays{
  public static void main(String args[]) {
    int num;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Number to show weekday :");
    num = sc.nextInt();
    switch(num)
    {
      case 1:
      System.out.println("Monday");
      break;
      case 2:
      System.out.println("Teusday");
      break;
      case 3:
      System.out.println("Wednesday");
      break;
      case 4:
      System.out.println("Thursady");
      break;
      case 5:
      System.out.println("Friday");
      break;
      case 6:
      System.out.println("Saturday");
      break;
      case 7:
      System.out.println("Sunday");
      break;
      default:
      System.out.println("Enter Number between 1 and 7");
    }
  }
}
