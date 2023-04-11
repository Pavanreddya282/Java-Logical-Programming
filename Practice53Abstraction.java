// Abstraction is a process of hiding the implementation details and showing only functionality to the user.
/*
abstract class Bike{  
  abstract void run();  
}  
class Practice53Abstraction extends Bike{  
void run(){System.out.println("running safely");}
public static void main(String args[]){  
 Bike obj = new Practice53Abstraction();  
 obj.run();  
}
}
*/
/*
abstract class Shape {
  abstract void draw();
}

class Rect extends Shape {
  void draw() {
    System.out.println("Drawing rectangle");
  }
}

class Circ extends Shape {
  void draw() {
    System.out.println("Drawing Circle");
  }
}

class Practice53Abstraction {
  public static void main(String args[]) {
    Shape s = new Rect();
    s.draw();
    Shape s1 = new Circ();
    s1.draw();
  }
}
*/
// abstract class
abstract class Animal{
  // Abstract method (does not have a body)
  abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}
// Subclass (inherit from Animal)
class Pig extends Animal{
  public void animalSound(){
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}
class Practice53Abstraction{
  public static void main(String args[]){
    Pig mypig =new Pig();
    mypig.animalSound();
    mypig.sleep();
  }
}

/*
// abstract class
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
class Practice53Abstraction {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
*/