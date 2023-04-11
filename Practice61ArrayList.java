//The ArrayList class is a resizable array, which can be found in the java.util package.
// The ArrayList class has many useful methods.
// Example 1 : add() Method.
/*
import java.util.ArrayList;
class Practice61ArrayList {
  public static void main(String args[]) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Toyata");
    cars.add("Suzuki");
    cars.add("Hyundai");
    cars.add("Ford");
    System.out.print(cars);
  }
}
*/
// Example 2 : get() Method.
/*
import java.util.*;
class Practice61ArrayList {
public static void main(String args[]) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Toyata");
    cars.add("Suzuki");
    cars.add("Hyundai");
    cars.add("Ford");
    System.out.print(cars.get(0));
  }
}
*/
/*
// Example 3 : set() Method.
import java.util.*;
class Practice61ArrayList {
public static void main(String args[]) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Toyata");
    cars.add("Suzuki");
    cars.add("Hyundai");
    cars.add("Ford");
  cars.set(0,"BMW");
    System.out.print(cars);
  }
}
*/
/*
// remove() method
import java.util.*;
class Practice61ArrayList {
public static void main(String args[]) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Toyata");
    cars.add("Suzuki");
    cars.add("Hyundai");
    cars.add("Ford");
  cars.remove(0);
    System.out.print(cars);
  }
}
*/
/*
// clear() method

import java.util.*;
class Practice61ArrayList {
public static void main(String args[]) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Toyata");
    cars.add("Suzuki");
    cars.add("Hyundai");
    cars.add("Ford");
  cars.clear();
    System.out.print(cars);
  }
}
*/
/*
// size() method

import java.util.*;
class Practice61ArrayList {
public static void main(String args[]) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Toyata");
    cars.add("Suzuki");
    cars.add("Hyundai");
    cars.add("Ford");
    System.out.print(cars.size());
  }
}
*/
/*
import java.util.ArrayList;
public class Practice61ArrayList{
  public static void main(String args[]){
    ArrayList<String> cars=new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Toyata");
    cars.add("Suzuki");
    cars.add("Hyundai");
    cars.add("Ford");
    for (int i=0;i<cars.size();i++){
      System.out.print("\t"+cars.get(i));
    }
  }
}
*/
/*
import java.util.ArrayList;
public class Practice61ArrayList{
  public static void main(String args[]){
    ArrayList<String> cars=new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Toyata");
    cars.add("Suzuki");
    cars.add("Hyundai");
    cars.add("Ford");
    for (String i:cars){
      System.out.print("\t"+i);
    }
  }
}
*/
//Sort an ArrayList
import java.util.ArrayList;
import java.util.Collections;
public class Practice61ArrayList{
  public static void main(String args[]){
    ArrayList<String> cars=new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Toyata");
    cars.add("Suzuki");
    cars.add("Hyundai");
    cars.add("Ford");
    Collections.sort(cars);  // Sort cars
    System.out.print(cars);
  }
}