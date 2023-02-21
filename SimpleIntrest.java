import java.util.Scanner;
class SimpleIntrest {
  public static void main(String args[]) {
float pa,tm,ri,SI,ta;
  Scanner sc = new Scanner(System.in);
    System.out.print("Enter principal ammount : ");
    pa = sc.nextFloat();
    System.out.print("Enter number of months : ");
    tm = sc.nextFloat();
    System.out.print("Enter rate of Intrest : ");
    ri = sc.nextFloat();
    SI = (pa * tm * ri)/100;
    ta = SI+pa;
    System.out.println("Simple intrest is :" +SI);
    System.out.println("Total ammount is :" +ta);
  }
  }