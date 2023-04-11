// Polymorphism: Polymorphism in Java is a concept by which we can perform a single action in different ways.
/*
//Runtime Polymorphism : Method Overriding : If the subclass has the same method name derived in parent class it is known as method overriding. Ex; Bank
class Bank{
  float getRateOfInterest(){
    return 0;
  }
}
class SBI extends Bank{
  float getRateOfInterest(){
    return 8.6f;
  } 
}
class ICIC extends Bank{
  float getRateOfInterest(){
    return 9.1f;
  }
}
class HDFC extends Bank{
  float getRateOfInterest(){
    return 10.5f;
  }
}
class Practice52Polymorphism
  {
    public static void main(String args[])
    {
      Bank b;
      b= new SBI();
      System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
      b= new HDFC();
      System.out.println("HDFC Rate of Interest: "+b.getRateOfInterest());
      b= new ICIC();
      System.out.println("ICIC Rate of Interest: "+b.getRateOfInterest());
    }
  }
*/
/*

// Runtime Polymorphism Example: Shape

class Shape{  
void draw()
  {
    System.out.println("drawing...");
  }  
}  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle...");}  
}  
class Circle extends Shape{  
void draw(){System.out.println("drawing circle...");}  
}  
class Triangle extends Shape{  
void draw(){System.out.println("drawing triangle...");}  
}  
class Practice52Polymorphism{  
public static void main(String args[]){  
//Shape s;  
Shape r=new Rectangle();  
r.draw();  
Shape c=new Circle();  
c.draw();  
Shape t=new Triangle();  
t.draw();  
}  
}  

*/

//Complile time polymorphism : Method Overloading : if the class has same method name but different arguments/parameters.
// Different ways to Overload: 1. By changing number of arguments, 2. By changing dataType.
/*
//Method Overloading: changing no. of arguments

class Adder{
  static int add(int a,int b){
    return a+b;
  }
  static int add(int a,int b,int c){
    return a+b+c;
  }
}
class Practice52Polymorphism {
  public static void main(String args[])
  {
    System.out.println(Adder.add(10,10));
    System.out.println(Adder.add(10,10,10));
  }
}
*/
// Method Overloading: Changing data types

class Polym {
  void Differ(int a, float b, String c) {
    System.out.println(a + " " + b + " " + c);
  }

  void Differ(float a, int b, String c) {
    System.out.println(a + " " + b + " " + c);
  }

  void Differ(String a, int b, float c) {
    System.out.println(a + " " + b + " " + c);
  }
}

class Practice52Polymorphism {
  public static void main(String args[]) {
    Polym p = new Polym();
    p.Differ(10, 10.1f, "Pavan");
    p.Differ(10.1f, 10, "Reddy");
    p.Differ("A", 10, 10.1f);
  }
}