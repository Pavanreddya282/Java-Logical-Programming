//WAP perform basic atm operation
import java.util.Scanner;
class Practice14 {
  public static void main(String args[]) {
    int dbpin = 1234;
    int dbbal = 2000;
    int pin, wthramnt, bal;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the debit card pin");
    pin = sc.nextInt();
    if (dbpin == pin) {
      System.out.println("Enter amnt to withdraw");
      wthramnt = sc.nextInt();
      if (wthramnt <= dbbal) {
        System.out.println("Collect the ammount");
        bal = dbbal - wthramnt;
        System.out.println("\nBalance is " + bal);
      } else 
        System.out.println("Begger!! You do not have enough money");
      // bal=dbbal-wthramnt;
      // System.out.println("Balance is "+bal);
    } else 
      System.out.println("Unknown user entered wrong pin");
  }
}