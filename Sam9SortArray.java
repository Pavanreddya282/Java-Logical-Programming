
// Sort the given array using scanner class
// before sort a{9,7,5,8,3}
// after sort a{3,5,7,8,9}
import java.util.*;

class Sam9SortArray {
  public static void main(String args[]) {
    int i, n, j, t = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of variables : ");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements to array : ");
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("The elements before sort :");
    for (i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
    for (i = 0; i < n - 1; i++) {
      for (j = 0; j < n - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
          t = a[j];
          a[j] = a[j + 1];
          a[j + 1] = t;
        }
      }
    }
    System.out.println("\nThe elements after sort :");
    for (i = 0; i < n ; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
