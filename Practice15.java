/*Switch case: The switch case in java executes one statement
  from multiple ones. Thus, it is like an if-else-if ladder
  statement. It works with a lot of data types.*/
/*In case of switch case, as per the value of the switch, 
  the control jumps to the corresponding case.*/
/*The switch statement is used to test the equality of a 
  variable against several values specified in the test cases.*/
/*Syntax
switch(choice)
{
 case 1:
 ------;
 break;
 case 2:
 ------;
 break;
 +
 +
 +
 case n:
 ------;
 break;
 default:
 -------;
}
}*/
class Practice15 {
  public static void main(String args[]) {
    int a = 10;
    int b = 2;
    int choice = 6;
    switch (choice) {
      case 1:
        System.out.println("sum =" + (a + b));
        break;
      case 2:
        System.out.println("substraction =" + (a - b));
        break;
      case 3:
        System.out.println("Multiplication =" + (a * b));
        break;
      case 4:
        System.out.println("Quotient =" + (a / b));
        break;
      case 5:
        System.out.println("Reminder =" + (a % b));
        break;
      default:
        System.out.println("wrong choice");
    }
  }
}