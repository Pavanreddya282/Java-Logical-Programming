import java.util.*;
class MultiA3{
  public static void main(String args[]){
    int r1,c1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter row size");
    r1=sc.nextInt();
    System.out.println("enter col size");
    c1=sc.nextInt();
    int arr[][]=new int[r1][c1];
      System.out.println("enter your vales :");
    for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        System.out.print(" " +arr[i][j]);
      }
      System.out.println();
    }
  }
}