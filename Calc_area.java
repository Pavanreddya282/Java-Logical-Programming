import java.util.Scanner;

class Calc_area {
  public static void main(String[] args) {
    int r;
    float pi = 3.14f;
    float a;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius of circle:");
    r = sc.nextInt();
    a = pi * r * r;
    System.out.println("Area of circle:" +a);
  }
}