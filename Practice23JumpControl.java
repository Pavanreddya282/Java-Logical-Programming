//Jump controll statements:- -- Help to ammend the flow of execution
/*
  1.Break:- A break statement uses to exit an existing loop, especially an infinite loop.... Refer Example1
  2.Continue:- Unlike break, the continue statement in java can only work inside loops. It doesn’t come out of the loop like a break. Instead, it forces the next iteration of the loop to bypass all the statements falling under it.... Refer Example2
  3.Return:- Return statements are the jump statements used inside methods (or functions) only. Any code in the method which is written after the return statement might be treated as unreachable by the compiler.
" Then return statement terminates the execution of the current method and passes the control to the calling method."
a. Return with value /// Syntax return value;
b. Return without value  /// Syntax return;
*/



/*Example 1
class Practice23JumpControl
  {
    public static void main(String args[]){
      int i=0;
      for(;;i++){
        if(i==5){
          break;  // breaks and come out of loop
        }
        else
          System.out.println(""+i);
      }
    }
  }
*/

/* Example 2
class Practice23JumpControl{
  public static void main(String args[]){
    for(int i=0;i<=10;i++){
      if(i<3){
        continue; //continues and goes to next iteration
      }
      System.out.println(""+i);
    }
  }
}
*/

// Example 3
class Practice23JumpControl{
  public static void main(String args[]){
    int age=12;
    System.out.println("I used return");
      if(age<18)
        return; //terminates the method
      System.out.println("Will not be executed");
  }
}

