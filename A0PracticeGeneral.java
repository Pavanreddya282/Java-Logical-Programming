/*
class A0PracticeGeneral {
  public static void main(String args[]) {
    int a[]={1,2,2,3,4,5,5,6};
    int i,j,t=0;
    //int a[]= new int[a.length];
    System.out.println("The elements before sort :");
    for (i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    for (i = 0; i < a.length - 1; i++) {
      for (j = 0; j < a.length - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
          t = a[j];
          a[j] = a[j + 1];
          a[j + 1] = t;
        }
      }
    }
    System.out.println("\nThe elements after sort :");
    for (i = 0; i < a.length - 1; i++) {
      System.out.print(a[i] + " ");
    }
  }
}*/
import java.util.*;

class A0PracticeGeneral {
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
    for (i = 0; i < n-1; i++) {
      for (j = 0; j < n-1; j++) {
        if (a[j] > a[j + 1]) {
          t = a[j];
          a[j] = a[j + 1];
          a[j + 1] = t;
        }
      }
    }
    System.out.println("\nThe elements after sort :");
    for (i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
