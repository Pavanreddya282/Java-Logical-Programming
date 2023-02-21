
//WAP delete an element from an array at specified position.
import java.util.Scanner;

class Sam21DelArrPosition {
  public static void main(String args[]) {
    int i, n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of variables : ");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("\nEnter elements to array : ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("\nThe elements in array is :");
    for (i = 0; i < n; i++) {
      System.out.println("The a["+i+"] value is :" + a[i]+" position "+(i+1));
    }
    System.out.println("\nEnter the position to delete :");
    int p=sc.nextInt();
    if(p==n+1){
      System.out.println("\nDeletion is not possible in the array");
    }
      for(i=p-1;i<n-1;i++){
        a[i]=a[i+1];
      }
      System.out.println("\nThe resultant array is");
        for(i=0;i<n-1;i++){
         System.out.print("\t" +a[i]);
        }
  }
}