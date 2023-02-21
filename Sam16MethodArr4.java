import java.util.Scanner;
class Sam16MethodArr{
  int[] MethodAr4(int x[]){
    int m[]=new int[x.length];
    for(int i=0;i<x.length;i++){
      m[i]=x[i];
    }
    return m;
    }
}
class Sam16MethodArr4{
  public static void main(String args[]){
    int n,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements to array");
    for(i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    Sam16MethodArr a1=new Sam16MethodArr();
    int p[]= a1.MethodAr4(a);
    System.out.println("The elements in array is");
    for(i=0;i<a.length;i++){
      System.out.print(" "+p[i]);
  }
}
}