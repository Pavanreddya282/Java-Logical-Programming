
import java.util.*;
//import java.util.Set;
//import java.util.HashSet;
//import java.util.TreeSet;

class CollectionSet {
  public static void main(String args[]) {

    // Set<Integer> nums = new HashSet<Integer>();
    // Set and HashSet give unique values but not in sequence
    // Set<Integer> nums = new TreeSet<Integer>();
    // Set and TreeSet give unique values in sorted sequence
    Collection<Integer> nums = new TreeSet<Integer>();
    nums.add(3);
    nums.add(1);
    nums.add(2);
    nums.add(8);
    nums.add(6);
    nums.add(3);// Duplicate value: 1 value only printed

    Iterator<Integer> values = nums.iterator();
    // We use the iterator() method refers to Iterator class to
    // get the next values and some usefull methods.

    while (values.hasNext()) // hasNext tells compiler that next element is there in loop by passing true
                             // value so, print that also when it is last element it will say false and come
                             // out of loop
      System.out.println(values.next()); // next print only one value

    // for (int n : nums) {
    // System.out.println(n);
    // }
  }
}