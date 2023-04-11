//Classes/objects/attributes
/*
public class Main { //Class
  int x = 5;// Attribute

  public static void main(String[] args) {
    Main myObj = new Main(); // myObj is the object
    System.out.println(myObj.x);// x is the attribute
    // Result is 5
  }
}
*/
/*
// Modify Attributes
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
    // Result 40
  }
}
*/
/*
// Override existing values
public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
// Result is 25
  }
}
*/
/*
// If you don't want the ability to override existing values, declare the attribute as final:
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
*/

import java.util.*;
class OddEven
  {
    public boolean isoddeven(int num)
    {
      if(num%2==0)
        return true;
      else
        return false;
    }
    public int readnum()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
      return num;
    }
  }
class Practice37
  {
    public static void main(String args[])
    {
      OddEven oe=new OddEven();
      int num=oe.readnum();
      if(oe.isoddeven (num))
        System.out.println(num+" is even");
      else
        System.out.println(num+" is odd");
    }
  }
