import java.util.Scanner;

class library{
  public static void main(String args[]) {
    int day,time;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the day in week :");
    day = sc.nextInt();
    if (day>=1 && day<=5)
    {
      System.out.println("Enter time 24hrs format :");
      time = sc.nextInt();
      if (time>=9 && time<=20)
      {
        System.out.println("Library is open");
      }
      else
      {
        System.out.println("Library timings are 9Am to 8pm");
      }
    }
    else
    {
      System.out.println("Library will remain close on saturday and sunday");
    }
  }
}