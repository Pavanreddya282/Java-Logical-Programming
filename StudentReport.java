import java.util.Scanner;
 
class StudentReport {
  public static void main(String args[]) {
    int sno, m, p, c, tot;
    String sname;
    float savg;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Number:");
    sno = sc.nextInt();
    System.out.println("Enter Student Name:");
    sname = sc.next();
    System.out.println("Enter Student Marks:");
    m = sc.nextInt();
    p = sc.nextInt();
    c = sc.nextInt();
 
    tot = m + p + c;
    savg = (float) tot / 3;
 
    System.out.println(" STUDENT DETAILS ");
    System.out.println(" ----------------");
    System.out.println("The Student Number is : " + sno);
    System.out.println("The Student Name   is : " + sname);
    System.out.println("Student Marks");
    System.out.println("Maths :" + m);
    System.out.println("Physics :" + p);
    System.out.println("Chemistry :" + c);
    System.out.println("Student Total is :" + tot);
    System.out.println("Student average is :" + savg);
    if (m >= 40 && p >= 40 && c >= 40) {
      System.out.println("Result : Pass");
      if (savg <= 50)
        System.out.println("Grade : C");
      else if (savg >= 51 && savg <= 70)
        System.out.println("Grade : B");
      else if (savg >= 71 && savg <= 80)
        System.out.println("Grade : A");
      else
        System.out.println("First class with Distinction");
    } else {
      System.out.println("Result : Fail");
    }
  }
 
}