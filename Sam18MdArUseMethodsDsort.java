import java.util.Scanner;
class ArrayDemo{
  int i,j,t;
  Scanner sc=new Scanner(System.in);
  void getArray(int a[],int n){
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
  void dispArray(int a[],int n){
    for(i=0;i<n;i++){
      System.out.print("  "+a[i]);
    }
  }
  void bubble(int a[],int n){
    for(i=0;i<n-1;i++){
      for(j=0;j<n-1-i;j++){
        if(a[j]>a[j+1]){
          t=a[j];
          a[j]=a[j+1];
          a[j+1]=t;
        }
      }
    }
  }
}
class Sam18MdArUseMethodsDsort{
  public static void main(String args[]){
    int i,n;
    ArrayDemo ad1=new ArrayDemo();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Size:");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter Elements to Array:");
    ad1.getArray(a,n);
    System.out.println("The Elements Before Sorting is:");
    ad1.dispArray(a,n);
    ad1.bubble(a,n);
    System.out.println("\nThe Elements After Sorting is:");
    ad1.dispArray(a,n);
  }
}