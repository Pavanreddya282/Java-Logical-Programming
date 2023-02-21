import java.util.Scanner;
class Area
{
  int square,rectangle;
  float circle;
  float pi = 3.14f; 
  void Circle(int r) {
    circle = pi * r * r;
    System.out.println("The area of circle is " + circle );
  }
  void Square(int l){
    square = 2*l;
    System.out.println("The area of square is " + square );
    }
  void Rectangle(int b,int w){
    rectangle = b*w;
    System.out.println("The area of rectangle is " + rectangle );
  }
}
class Shapes
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      Area a =new Area();
      int r;
      System.out.println("Enter the radius of a circle ");
      r=sc.nextInt();
      a.Circle(r);
      int l;
      System.out.println("Enter length of a square ");
      l=sc.nextInt();
      a.Square(l);
      int b,w;
      System.out.println("Enter breadth and width of a rectangle ");
      b=sc.nextInt();
      w=sc.nextInt();
      a.Rectangle(b,w);   
    }
  }