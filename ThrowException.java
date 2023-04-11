import java.util.*;

class ThrowException {
  public static void main(String args[]) {
    int i = 10;
    int j = 15;
    int r = 0;

    try {
      r = i / j;
      if (r == 0)
        // create a constructor throw the exception
        throw new ArithmeticException("You cannot devide by zero or greater number ");
    } catch (ArithmeticException e) {
      r = i / 1;
      System.out.println("Thats your default value" + e);
    } catch (Exception e) {
      System.out.println("Something went wrong");
    }

    System.out.println(r);
  }
}