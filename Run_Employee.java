import java.util.Scanner;
class Run_Employee {
  public static void main(String args[]) {
    int a;
    String st;
    Float sal;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Employee No. : ");
    a=sc.nextInt();
    System.out.println("Enter Employee Name : ");
    st=sc.next();
    System.out.println("Enter Employee Salary : ");
    sal=sc.nextFloat();
    System.out.println("The Employee No is : " +a);
    System.out.println("The Employee Name is : " +st);
    System.out.println("The Employee Salary is : " +sal);
  }
}