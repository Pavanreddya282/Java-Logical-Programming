import java.util.Scanner;
class Area
{
  float a;
  float p;
  void add( int b, int h ) {
    a = b*h;
    p = 2*a;
    System.out.println();
    System.out.println("The area of rectangle is " + a );
    System.out.println("The perimeter of rectangle is " + p );
  }
}
  class CalcPere
  {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int a,b;
    Area a2 = new Area();
    System.out.print("Enter length of rectangle : ");
    a = sc.nextInt();
    System.out.print("Enter base of rectangle : ");
    b = sc.nextInt();
    a2.add(a,b);
  }  
}