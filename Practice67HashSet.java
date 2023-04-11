//A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

// Import the HashSet class
import java.util.HashSet;

public class Practice67HashSet {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");// Duplicated value
    cars.add("Mazda");
    System.out.println(cars);// Output: [Volvo,Mazda,Ford,BMW]
    System.out.println(cars.contains("Mazda"));// Output: true
    cars.remove("Volvo");
    System.out.println(cars);// Output: [Mazda,Ford,BMW]
    System.out.println(cars.size());
    cars.clear();
    System.out.println(cars);
  }
}