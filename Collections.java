import java.util.*;
/*
class Collections {
  public static void main(String a[]) {

    Collection nums = new ArrayList();
    nums.add(6);  //all are objects we did not specify type of object which may be Integer, String etc.
    nums.add(7);
    nums.add(5);
    nums.add(4);
    nums.add("8");  //object

    System.out.println(nums);

    for (Object n : nums) {
       int num = (Integer) n;
      System.out.println(num);
    }
  }
}
*/
/*
 * The problem here is we have not specified the class type such as Integer,
 * String or any.. here everything is object If we add number in double quotes,
 * we will get compile time error when we convert to int so always use type of objects you want to add. compare above and below code.
 
 the Collection interface is limited we cannot use it to print index values.. So we use List that implemented by Collection->
 FYA: ArrayList implements List implements Collection interface.
 List has many useful methods like get(index). 
 */

class Collections {
  public static void main(String a[]) {

    List<Integer> nums = new ArrayList<Integer>();
    nums.add(6); // Integer type object
    nums.add(7);
    nums.add(5);
    nums.add(4);
    // nums.add("8"); // added String type got runtime error

    System.out.println(nums.get(2));
    System.out.println(nums.indexOf(7));

    // for (int n : nums) {
    // System.out.println(n);
    // }
  }
}