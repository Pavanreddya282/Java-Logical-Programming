
// Skip the values
import java.util.Scanner;
class Sam8SkipValues
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter Number of variables : ");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter elements to array : ");
      for (i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("The elements in array is :");
      for(i=0;i<n;i++)
        {
          System.out.print("\t"+a[i]);
        }
        int skip;
      System.out.println("\n Enter Number to skip in array : ");
      skip=sc.nextInt();
        for(i=0;i<n;i++)
          {
            if(skip==a[i])
            {
              skip=a[i];
              continue;
            }
            System.out.print("\t"+a[i]);
             if(i==n){
              System.out.println("number is not found");
             }
            }
    }
  }