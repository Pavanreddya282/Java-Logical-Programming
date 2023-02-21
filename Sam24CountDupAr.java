import java.util.Scanner;

class Sam24CountDupAr {
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
    int i,j,count=0;
    for (i=0;i<n;i++){
      for(j=i+1;j<n;j++){
        if(a[j]==a[i]){
          count++;
          break;
        }
      }
    }
    System.out.println("\nTotal number of duplicate elements is"+count);   
  }
}
// Unfinished

