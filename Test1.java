/*A university has different types of employees, including faculty members and administrative staff. The university wants to keep track of their personal information, such as their names and contact details, as well as their job-specific information, such as their salary and job title. Create a superclass called "Employee" with the following attributes: name (String)
email (String)
phone number (String)
Create two subclasses of Employee: FacultyMember, with the additional attribute of "department" (String)
AdministrativeStaff, with the additional attribute of "jobTitle" (String)
Create a constructor for each subclass that initializes its respective additional attribute(s) along with the attributes inherited from the superclass. Create a method for each subclass to display its specific attributes along with the attributes inherited from the superclass. In the main method, create at least one object of each subclass and call the respective method to display their attributes.*/

class Employee
  {
    String name;
    String email;
    String PhoneNo;
    //String Department;
    //String Jobtitle;
    Employee(String name , String email , String PhoneNo)
    {
      this.name=name;
      this.email=email;
      this.PhoneNo=PhoneNo;
      //this.Department=Department;
      //this.Jobtitle=Jobtitle;
    }
    void disp()
    {
      System.out.println("Emloyee Name : "+name);
      System.out.println("Emloyee Email : "+email);
      System.out.println("Emloyee PhoneNo : "+PhoneNo);
      System.out.println();
    }
  }
class Faculty extends Employee
  {
    String Department;
    Faculty(String name,String email,String PhoneNo,String Department)
    {
      super(name,email,PhoneNo);
      this.Department=Department;
      {
        disp();
        System.out.println("Emloyee Department : " +Department);
         System.out.println();
      }
    }
  }
class AdminStaff extends Employee
  {
    String Jobtitle;
    AdminStaff(String name,String email,String PhoneNo,String Jobtitle)
    {
      super(name,email,PhoneNo);
      this.Jobtitle=Jobtitle;
      disp();
      System.out.println("Emloyee Job Title : " +Jobtitle);
      System.out.println();
    }
  }
class Test1
  {
    public static void main(String args[])
    {
      Faculty f=new Faculty("Employee1","Employee1@hotmail.com","8432154321","IT");
      f.disp();
      AdminStaff f1=new AdminStaff("Employee2","Employee2@hotmail.com","9432154321","Developer");
      f1.disp();
    }
  }