//else if ladder: use if the possiblities is more than two
//In else if ladder, the control goes through the every else if statement until it finds true value of the statement or it comes to the end of the else if ladder.
//mostly used for > and <
import java.util.Scanner;
class Practice8 {
  public static void main(String args[]) {
    char signal;
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Traffic signal r,y,g"); 
     signal=sc.next().charAt(0);
    
    if (signal == 'r') {
      System.out.println("warm up your engine");
    } else if (signal == 'y') {
      System.out.println("Revvv it!!");
    } else if (signal == 'g') {
      System.out.println("Release to escape");
    } else {
      System.out.println("\nYou are not in race");
    }
    System.out.println("\nThank you!! visit again");
  }
}