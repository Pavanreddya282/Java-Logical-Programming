// A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type 
// One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
/*
// The HashMap class has many useful methods. For example, to add items to it, use the put() method:
import java.util.HashMap;
class Practice65HashMap{
  public static void main(String args[]){
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}
*/
/*
// To access a value in the HashMap, use the get() method and refer to its key:
import java.util.HashMap;
class Practice65HashMap{
  public static void main(String args[]){
    HashMap<String, String> capitalCities =new HashMap<String, String>();
    capitalCities.put("England","London");
    capitalCities.put("Germany","Berlin");
    capitalCities.put("Norway","Oslo");
    capitalCities.put("USA","Washington DC");
    System.out.println(capitalCities.get("England"));
  }
}
*/
/*
// To remove an item, use the remove() method and refer to the key:
import java.util.HashMap;
class Practice65HashMap{
  public static void main(String args[]){
    HashMap<String, String> capitalCities =new HashMap<String, String>();
    capitalCities.put("England","London");
    capitalCities.put("Germany","Berlin");
    capitalCities.put("Norway","Oslo");
    capitalCities.put("USA","Washington DC");
    capitalCities.remove("England");
    System.out.println(capitalCities);
  }
}
*/
/*
// To remove all items, use the clear() method:

import java.util.HashMap;
class Practice65HashMap{
  public static void main(String args[]){
    HashMap<String, String> capitalCities =new HashMap<String, String>();
    capitalCities.put("England","London");
    capitalCities.put("Germany","Berlin");
    capitalCities.put("Norway","Oslo");
    capitalCities.put("USA","Washington DC");
    capitalCities.clear();
    System.out.println(capitalCities);
  }
}
*/
/*
// To find out how many items there are, use the size() method:

import java.util.HashMap;
class Practice65HashMap{
  public static void main(String args[]){
    HashMap<String, String> capitalCities =new HashMap<String, String>();
    capitalCities.put("England","London");
    capitalCities.put("Germany","Berlin");
    capitalCities.put("Norway","Oslo");
    capitalCities.put("USA","Washington DC");
    System.out.println(capitalCities.size());
  }
}
*/