import java.io.*;

class PrintASCII {
  public static void main(String args[]) throws IOException {

    System.out.println("Enter a Number");
    int num = System.in.read();
    // read method returns only int values
    // it reads only single char

    /*
     * By default every character has ASCII Values for example:
     * 
     * ASCII Value of 0 is 48, a is 97, A is 65
     */

    // It will provide ASCII value of Char
    System.out.println(num);

  }
}