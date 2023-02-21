import java.util.Scanner;
class Employee
  {
    void ID()
    {
    String st1;
    String st2;
    int st3;
    float yearly;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Employee No. : ");
    st1=sc.next();
    System.out.println("Enter Employee Name : ");
    st2=sc.next();
    System.out.println("Enter Employee Salary : ");
    st3=sc.nextInt();

      yearly = st3*12;

    System.out.println("The Employee No is : " +st1);
    System.out.println("The Employee Name is : " +st2);
    System.out.println("The Employee Salary is : " +st3);
    System.out.println("The Employee Yearly Income is : " +yearly);
    }
  }

class EmployeeID
{
  public static void main(String args[])
  {
    Employee e = new Employee();
    e.ID();
  }
}