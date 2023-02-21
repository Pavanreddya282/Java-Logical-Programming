import java.util.Scanner;
class Sam6MaxofArray
  {
    public static void main(String args[])
    {
      int i,n,min,max;
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
        min=max=a[0];
        for(i=0;i<n;i++)
        {
          if(a[i]>a[0])
          {
            max=a[i];
          }
          if(a[i]<a[0])
          {
            min=a[i];
          }
        }
      System.out.println("\n The max value is : "+max);
      System.out.println("\n The min value is : "+min);
    }
  }