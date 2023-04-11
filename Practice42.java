// Program to print the largest and smallest element of array
/*
import java.util.Scanner;
class Practice42
  {
    public static void main(String []args)
    {
      int n;
      int i,max,min;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the size of an array");
      n=sc.nextInt();
      int [] arr=new int[n];
      System.out.println("Enter elements to an array");
      for (i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("The elements in an array");
      for (i=0;i<n;i++){
        System.out.print("\t"+arr[i]+"");
      }
      max = min = arr[0];
      for(i=0;i<n;i++){
        if(arr[i]>max){
          max=arr[i];
        }
        if(arr[i]<min){
          min=arr[i];
        }
      }
      System.out.println("\nThe Maximum element of array is "+max);
      System.out.println("\nThe Maximum element of array is "+min);
    }
  }
*/
/* Sum and Average of an array
import java.util.Scanner;
class Practice42
  {
    public static void main(String args[])
    {
      int n,i;
      double sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      n=sc.nextInt();
      int[] a=new int[n];// datatype[] variable=new datatype[size]
      System.out.println("Enter elements to array");
      for(i=0;i<n;i++){
          a[i]=sc.nextInt();
        }
      System.out.println("The elements in array is ");
      for(int a1:a){
         System.out.print("\t"+a1);
      }
      for(int a1:a){
        sum=sum+a1;
      }
      System.out.println("\nSum of array is "+sum);
      double al = a.length;
      double avg = sum/al;
      System.out.println("\nAverage of array is "+avg);
    }
  }
*/
/* Search an element in an array
import java.util.Scanner;
class Practice42
  {
    public static void main(String args[])
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      n=sc.nextInt();
      int[] a=new int[n];
      System.out.println("Enter the array elements");
      for(i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("\nThe elements in array is ");
      for(int a1:a){
        System.out.print("\t"+a1);
      }
      int ser;
      System.out.println("\nEnter element to search");
      ser=sc.nextInt();
      for(i=0;i<n;i++){
        if(ser==a[i]){
           System.out.println(ser+" is found");
          break;
        }
      }
      if(i==n)
        System.out.println(ser+" is not found");
    }
  }
*/
/*
import java.util.Scanner;
class Practice42
  {
    public static void main(String args[])
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      n=sc.nextInt();
      int[] a=new int[n];
      System.out.println("Enter the array elements");
      for(i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("\nThe elements in array is ");
      for(int a1:a){
        System.out.print("\t"+a1);
      }
      int skp;
      System.out.println("\nEnter element to Skip");
      skp=sc.nextInt();
      System.out.println("\nThe array after skip element");
      for(i=0;i<n;i++){
        if(skp==a[i]){
          skp=a[i];
          continue;
        }
        System.out.print("\t"+a[i]);
      }
    }
  }
*/
/* Sort Array and print second smallest and largest numbers
import java.util.Scanner;
class Practice42
  {
    public static void main(String args[])
    {
      int n,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      n=sc.nextInt();
      int[] a=new int[n];
      System.out.println("Enter the array elements");
      for(i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("\nThe elements before sort ");
      for(int a1:a){
        System.out.print("\t"+a1);
         
           //6,3,8,2,0 = 3,6,8,2,0 = 3,6,2,8,0 = 3,6,2,0,8 
           //1 itiration complete same for next itirations
        
      }
      int tmp= a[0];
      
      for(i=0;i<a.length;i++){//8
        for(j=i+1;j<a.length;j++){//3,8,2,0
          // Ascending order sort
          if(a[i]>a[j]){//6>3,6>8,8>2,8>0
            tmp=a[i];//6=6-tmp=6,6=8-tmp=8,8=8-tmp=8,
            a[i]=a[j];//6=3-a[0]=3,8=2-a[2]=2,8=0-a[3]=0,
            a[j]=tmp;//3=6-a[1]=6,2=6-a[3]=8,0=8-a[4]=8,
            // For Descending order in if change ">" symbol to "<"
          }
        }
      }
      System.out.println("\nThe elements after sort ");
      for(int a1:a){
        System.out.print("\t"+a1);
      }
      System.out.println("\nThe second smalest element is " +a[1]);
      //size n = 5 = a.length = positions != indecies;
      System.out.println("\nThe second largest element is " +a[a.length-2]);
    }
  }
*/
/*
import java.util.Scanner;
class Practice42
  {
    public static void main(String args[])
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter elements to array");
      for(i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("\nElements in array");
      for(int a1:a){
        System.out.print("\t"+a1);
      }
      int even=0;
      int odd=0;
      for(i=0;i<n;i++){
        if(a[i]%2==0){
          even++;
        }
        if(a[i]%2==1){
          odd++;
        }
      }
      System.out.println("\nThe Number of Even is "+even+", The Number of Odd is "+odd+".");
    }
  }
*/
/* 
// Frequency of elemnet in an array
import java.util.Scanner;
class Practice42
  {
    public static void main(String args[])
    {
      int n,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter elements to array");
      for(i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("\nElements in array");
      for(int a1:a){
        System.out.print("\t"+a1);
      }
      int fr[]=new int[a.length];
      int visited=-1;
      for(i=0;i<n;i++){
        int count=1;
        for(j=i+1;j<n;j++){
          if(a[i]==a[j]){
            count++;
            fr[j]=visited;
          }
        }
        if(fr[i]!=visited){
          fr[i]=count;
        }
      }
      for(i=0;i<fr.length;i++){
        if(fr[i]!=visited)
          System.out.println("\nThe frequency of "+a[i]+" is " +fr[i]);
      }
    }
  }
*/
/*
// Delete position in an array
import java.util.Scanner;

class Practice42 {
  public static void main(String args[]) {
    int i;
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of variables : ");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements to array");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("\nThe elements in an array is");
    for (i = 0; i < n; i++) {
      System.out.print("\t" + a[i]);
    }
    for (i = 0; i < n; i++) {
      System.out.println("\nThe a[" + i + "] value is :" + a[i] + " position " + (i + 1));
    }
    System.out.println("\nEnter the position to delete :");
    int p = sc.nextInt();
    if (p <= 0 || p >= n + 1) {
      System.out.println("\nInvalid position");
    } else 
    
    for (i = p - 1; i < n - 1; i++) {
      a[i] = a[i + 1];
    }
    System.out.println("\nThe resultant array is");
    for (i = 0; i < n - 1; i++) {
      System.out.print("\t" + a[i]);
    }
  }
}
*/

import java.util.Scanner;
class Practice42
  {
    public static void main(String args[])
    {
      int n1,n2,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array1 size");
      n1=sc.nextInt();
      int a[]=new int[n1];
      System.out.println("Enter elements to array1");
      for(i=0;i<n1;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("Enter the array2 size");
      n2=sc.nextInt();
      int b[]=new int[n2];
      System.out.println("Enter elements to array2");
      for(i=0;i<n2;i++){
        b[i]=sc.nextInt();
      }
      int n3=n1+n2;
      int c[]=new int[n3];
      for(i=0;i<n1;i++){
        c[i]=a[i];
      }
      for(i=0;i<n2;i++){
        c[n1+i]=b[i];
      }
      System.out.println("\nArray merged");
      for(i=0;i<c.length;i++){
        System.out.print("\t"+c[i]);
      }
    }
  }
