
//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes


// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }
}
class Practice48Constructor{
  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

/*
//default constructor :The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
class defaultConstructor
  {
    int id;
    String name;

    void display(){
      System.out.println(id+","+name);
    }
  }
class Practice48Constructor
  {
    public static void main(String args[])
    {
      defaultConstructor d=new defaultConstructor();
      d.display();
      d.display();
    }
  }
*/
/*
//Parameterized Constructor: A constructor which has a specific number of parameters is called a parameterized constructor.

class parameterizedConstructor
  {
    int id;
    String name;

    parameterizedConstructor(int i, String n){
      id = i;
      name = n;
    }
    void display(){
      System.out.println(id+","+name);
    }
  }
class Practice48Constructor
  {
    public static void main(String args[])
    {
      parameterizedConstructor pc = new parameterizedConstructor(33,"Pavan");
      parameterizedConstructor pc1 = new parameterizedConstructor(1,"Reddy");
      pc.display();
      pc1.display();
    }
  }
*/

// Constructor Overloading: Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
/*
class overload
  {
    int id;
    String name;
    int std;

    overload(int i,String n){
      id=i;
      name=n;
    }
    overload(int i,String n,int s){
      id =i;
      name=n;
      std=s;
    }
    void display(){
      System.out.println("Student ID "+id+ " Name "+name+" Standard "+std);
    }
  }
class Practice48Constructor
  {
    public static void main(String args[])
    {
      overload o=new overload(1,"pav");
      o.display();
      overload o1=new overload(1,"red",3);
      o1.display();
      
    }
  }
*/