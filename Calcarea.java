import java.util.Scanner;
class Area
{
  float circle;
  float pi = 3.14f;
  void add() {
    circle = pi * r * r;
    System.out.println("The area of circle is " + circle );
  }
}
  class Calcarea
  {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int r;
    Area a2 = new Area();
    System.out.print("Enter radius of circle : ");
    r = sc.nextInt();
    a2.add(r);
  }  
}