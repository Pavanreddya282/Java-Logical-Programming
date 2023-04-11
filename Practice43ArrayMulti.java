/*
Multidimensional Array is array of arrays.
Syntax:
dataType[][] Variable_name = new dataType[rowSize][colSize];
  Ex: int[][] arr = new int[3][3];
*/
/*
class Practice43ArrayMulti
  {
    public static void main(String args[])
    {
      int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
          System.out.print("\t"+arr[i][j]);
        }
        System.out.println();
      }
    }
  }
*/
/*
import java.util.*;
class Practice43ArrayMulti
  {
    public static void main(String args[])
    {
      int i,j,r,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter row size");
      r=sc.nextInt();
      System.out.println("Enter col size");
      c=sc.nextInt();
      int arr[][]=new int[r][c];
      System.out.println("Enter elements to array");
      for(i=0;i<r;i++){
        for(j=0;j<c;j++){
          arr[i][j]=sc.nextInt();
          //System.out.print(" "+arr[i][j]);
        }
        System.out.println();
      }
      System.out.println("Elements in array ");
      for(i=0;i<r;i++){
        for(j=0;j<c;j++){
          System.out.print(" "+arr[i][j]);
        }
        System.out.println();
      }
    }
  }
*/
import java.util.*;
class Practice43ArrayMulti
  {
    public static void main(String args[])
    {
      int i,j,r,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter row size");
      r=sc.nextInt();
      System.out.println("Enter col size");
      c=sc.nextInt();
      int a[][]=new int[r][c];
      int b[][]=new int[r][c];
      int z[][]=new int[r][c];
      System.out.println("Enter 1st matrix elements");
      for(i=0;i<r;i++){
        for(j=0;j<c;j++){
          a[i][j]=sc.nextInt();
        }
      }
      System.out.println("Enter 2nd matrix elements");
      for(i=0;i<r;i++){
        for(j=0;j<c;j++){
          b[i][j]=sc.nextInt();
        }
      }
      System.out.println("Elements in 1st matrix");
      for(i=0;i<r;i++){
        for(j=0;j<c;j++){
          System.out.print(" "+a[i][j]);
        }
        System.out.println();
      }
      System.out.println("Elements in 2nd matrix");
      for(i=0;i<r;i++){
        for(j=0;j<c;j++){
          System.out.print(" "+b[i][j]);
        }
        System.out.println();
      }
      for(i=0;i<r;i++){
        for(j=0;j<c;j++){
          z[i][j]=a[i][j]+b[i][j];
        }
      }
      System.out.println("addition of matrices is ");
      for(i=0;i<r;i++){
        for(j=0;j<c;j++){
          System.out.print(" "+z[i][j]);
        }
         System.out.println();
      }
    }
  }
