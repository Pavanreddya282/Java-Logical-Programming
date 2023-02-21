import java.util.Scanner;
class A1FindMaxMinArray{
    public static void main(String args[]){
      int i,n,max,min;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter Number of variables : ");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter elements to array : ");
      for (i=0;i<n;i++){
          a[i]=sc.nextInt();
        }
      System.out.println("The elements in array is :");
      for(i=0;i<n;i++){
          System.out.print("\t"+a[i]);
        }
      max=a[0];
      for(i=1;i<a.length;i++){
        if(a[i]>a[0]){
          max=a[i];
        }
      }
      System.out.println("\n The max value is : "+max);
        min=a[0];
      for(i=1;i<a.length;i++){
        if(a[i]<a[0]){
          min=a[i];
        }
      }
      System.out.println("\n The min value is : "+min);
    }
  }
