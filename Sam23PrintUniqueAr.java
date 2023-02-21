// WAP print all unique elements in the array.

import java.util.Scanner;

class Sam23PrintUniqueAr {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("\nEnter the elements to array");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("\nThe elements in array");
    for (int i = 0; i < n; ++i) {
      System.out.print(a[i] + " ");
    }
    int i,j,count;
    //int c[]=new int[n];
    System.out.print("\nThe unique elements in array is");
    for ( i = 0; i < n; i++) {
      count = 0;
      for ( j = i + 1; j < n; j++){
        if (a[i] == a[j]){
          count++;
        }
      }
      if(count==0){
        System.out.print(" \n" + a[i]);
        //c[i]=a[i];
      }
      
  }
    /*System.out.println("\nUnique/Distinct elements are");
    for (i = 0; i < c.length; i++)
            System.out.print(" \t" + c[i]);*/
}
}
// Wrong output filling emptied position with 0
