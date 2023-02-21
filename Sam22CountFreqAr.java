
// WAP to count frequency of each element in an array.
import java.util.Scanner;

class Sam22CountFreqAr {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the elements to array");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("\nElements with duplicate values");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
    // new array to store frequencies of element
    int[] fr = new int[a.length];
    int visited=-1;
    for (int i = 0; i < n; i++) {
      int count = 1;
      for (int j = i + 1; j < n; j++) {
        if (a[i] == a[j]) {
          count++;
          // To avoid counting same element again
          fr[j] = visited;
        }
      }
      if (fr[i] != visited) {
        // not visited increase the count
        fr[i] = count;
      }
    }
    for (int i = 0; i < fr.length; i++) {
      // print only the unique elements
      if (fr[i] != visited)
        System.out.println("\nFrequency of " + a[i] + " : " + fr[i]);
    }
  }
}
