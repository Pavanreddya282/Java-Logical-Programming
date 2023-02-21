import java.util.Scanner;
class Sam14MethodArr{
  void MethodAr2(int x[]){
    int i;
    System.out.println("The elements in array is");
    for(i=0;i<x.length;i++){
      System.out.print(" "+x[i]);
    }
  }
}
class Sam14MethodArr2{
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
    Sam14MethodArr a1=new Sam14MethodArr();
    a1.MethodAr2(a);
  }
}