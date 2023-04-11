
/*
import java.util.*;
class Methods
  {
    void Method(){
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("\nEnter Elements to array");
      for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("\nelements in an array is");
      for(int a:arr){
        System.out.print("\t"+a);
      }
    }
  }
class Practice29
  {
    public static void main(String args[])
    {
      Methods m=new  Methods();
      m.Method();
    }
  }
*/
/*

import java.util.*;

class Methods {
  void Method(int a[], int b) {
    System.out.println("\nelements in an array is");
    for (int i = 0; i < b; i++) {
      System.out.print("\t" + a[i]);
    }
  }
}

class Practice29 {
  public static void main(String args[]) {
    int n, i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter Elements to array");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Methods m = new Methods();
    m.Method(arr, n);
  }
*/
/*
import java.util.*;
class Methods
  {
    int [] Method(int x[])
    {
      return x;
    }
  }
class Practice29
  {
    public static void main(String args[])
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println(" Enter elemnts to array");
      for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      Methods m=new Methods();
      int p[]=m.Method(arr);
      System.out.println(" The elements in an array is");
      for(int a:arr){
         System.out.print("\t"+a);
      }
    }
  }
*/
/*
import java.util.*;
class Methods
  {
    int [] Method(int x[])
    {
    int m[]=new int[x.length];
    for(int i=0;i<x.length;i++){
      m[i]=x[i];
    }
      return m;
    }
  }
class Practice29
  {
    public static void main(String args[])
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println(" Enter elemnts to array");
      for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      Methods m=new Methods();
      int p[]=m.Method(arr);
      System.out.println(" The elements in an array is");
      for(int a:p){
         System.out.print("\t"+a);
      }
    }
  }
*/
/*
// Bubble sort array using methods
import java.util.*;

class Methods {
  int i,j;
  Scanner sc = new Scanner(System.in);
  void getArray(int x[], int num) {
    for (i = 0; i < num; i++) {
      x[i] = sc.nextInt();
    }
  }

  void dispArray(int x[], int num){
    for(int b:x){
      System.out.print("\t"+b);
    }
  }
  void sortBubble(int x[], int num){
    int temp;
    for(i=0;i<num-1;i++){
      for(j=0;j<num-1-i;j++){
        if(x[j]>x[j+1]){
          temp=x[j];
          x[j]=x[j+1];
          x[j+1]=temp;
        }
      }
    }
  }
}

class Practice29 {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter array elments");
    Methods m = new Methods();
    m.getArray(arr, n);
    System.out.println("Array elments are");
    m.dispArray(arr,n);
    System.out.println("\nArray elments before sort");
    m.dispArray(arr,n);
    
    m.sortBubble(arr,n);
    System.out.println("\nArray elments after sort");
    m.dispArray(arr,n);
  }
}
*/
// Sum of Matrix using methods
import java.util.*;
class Methods
  {
    int i,j;
    Scanner sc = new Scanner(System.in);
    void getArray(int x[][],int r1,int c1){
      for(i=0;i<c1;i++){
        for(j=0;j<r1;j++){
          x[i][j]=sc.nextInt();
        }
      }
    }
    void dispArray(int x[][],int r1,int c1){
      for(i=0;i<c1;i++){
        for(j=0;j<r1;j++){
          System.out.print(" "+x[i][j]);
        }
        System.out.println();
      }
    }
    void clacArray(int x[][],int y[][],int p[][],int r1,int c1){
      for(i=0;i<c1;i++){
        for(j=0;j<r1;j++){
          p[i][j]=0;
          for(int k=0;k<c1;k++){
            p[i][j]=p[i][j]+(x[i][j]*y[i][j]);
          }
        }
      }
    }
  }
class Practice29
  {
    public static void main(String args[]){
      Methods m = new Methods();
      int r,c;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter row size");
      r=sc.nextInt();
      System.out.println("Enter col size");
      c=sc.nextInt();
      int a[][]=new int[r][c];
      int b[][]=new int[r][c];
      int z[][]=new int[r][c];
      System.out.println("Enter 1st matrix elements");
      m.getArray(a,r,c);
      System.out.println("Enter 2nd matrix elements");
      m.getArray(b,r,c);
      System.out.println("Elements in 1st matrix");
      m.dispArray(a,r,c);
      System.out.println("Elements in 2nd matrix");
      m.dispArray(b,r,c);
      System.out.println("______________________");
      m.clacArray(a,b,z,r,c);
      System.out.println("Matrix Multiplication");
      m.dispArray(z,r,c);
    }
  }
