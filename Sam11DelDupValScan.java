// Remove consecutive duplicate values using scanner class
import java.util.Scanner;
class Sam11DelDupValScan{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements to array");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Elements with duplicate values");
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
    int j = 0;
      for (int i = 0;i < n;i++){
        if (a[i] != a[j]){
          a[++j] = a[i];
        }
      }
    System.out.println("\nElements without duplicate values");
    for (int i = 0;i <= j;i++){
      System.out.print(a[i] + " ");
    }
  }
}