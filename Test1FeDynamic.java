import java.util.*;
class Test1FeDynamic {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++){
      System.out.println("Enter the Elements :");
      arr[i]=sc.nextInt();
      
    }
    /*for (int a:arr) {
      System.out.print("\t"+a);*/
    }
  }
}
