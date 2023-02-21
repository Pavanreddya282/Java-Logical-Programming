import java.util.Scanner;
class Sam4
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
    }
  }
