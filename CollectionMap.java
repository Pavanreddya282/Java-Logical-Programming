import java.util.Map;
import java.util.HashMap;

class CollectionMap {
  public static void main(String args[]) {
    Map<String, Integer> students = new HashMap<>();

    students.put("Pavan", 78);
    students.put("Avan", 90);
    students.put("Van", 68);
    students.put("Navap", 43);
    students.put("Navap", 53); // Duplicate Key

    System.out.println(students); // In Console No vertical order
    System.out.println(students.keySet()); // will get all key elements

    for (String name : students.keySet()) {
      System.out.println(name + " : " + students.get(name)); // That's the output I want
    }
  }
}

/*
 * Duplicate Key: What happens is it will not print duplicate "Key" instead it
 * updates the "value". So we can say Key is Set and Value is List--> Which
 * describes Map is collection of Set and Key.
 */