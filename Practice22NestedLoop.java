// Nested loops:- If a loop exists inside the body of another loop is called nested loop.
// Pattern

class Practice22
  {
    public static void main(String args[])
    {
      int weeks=3;
      int days=7;
      for (int i =1; i<weeks;i++)
        {
          System.out.println("\nWeek "+i);
          for(int j=1;j<=days;j++)
            {
              System.out.println("Day "+j);
            }
        }
    }
  }