import java.util.Scanner;
class Sam7SearchINarray
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
      
        int ser;
      System.out.println("\n Enter Number to search in arrays : ");
      ser=sc.nextInt();
      
        for(i=0;i<n;i++)
          {
            if(ser==a[i])
            {
              System.out.println(ser+" is Found");
              break;
            }
          }
          if(i==n)
          {
            System.out.println(ser+" is not Found");
          }
    }
  }