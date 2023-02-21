import java.util.Scanner;
class Sam15MethodArr{
  int[] MethodAr3(int x[]){
    return x;
    }
}
class Sam15MethodArr3{
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
    Sam15MethodArr a1=new Sam15MethodArr();
    int p[]= a1.MethodAr3(a);
    System.out.println("The elements in array is");
    for(i=0;i<a.length;i++){
      System.out.print(" "+p[i]);
  }
}
}