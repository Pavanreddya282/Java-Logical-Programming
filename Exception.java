import java.util.*;
class Exception {
  public static void main (String args[]) {
    int i=2;
    int j=1;
    int r=0;
    String str=null;

    int nums[] = new int[5];

    try {
      r=i/j;

      System.out.println(nums[0]);
      System.out.println(nums[3]);
      System.out.println(str.length());
    }
    catch(ArithmeticException e) {
        System.out.println("You cannot divide by zero");
    }
    catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Trying to access the element outside array size");
    }
    catch(NullPointerException e) {
        System.out.println("String is null");
    }
    catch (Exception e) {
      System.out.println("Something went wrong");
    }

    System.out.println(r);
  }
}