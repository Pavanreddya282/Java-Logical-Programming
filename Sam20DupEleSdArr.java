// WAP Remove the sorted duplicate elements in an array
import java.util.Scanner;
class Sam20DupEleSdArr{
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
    int j=0;
    //use nested loop to read duplicate elements in array
    for(int i=0;i<n-1;i++){
        //use if to check duplicate element
        if(a[i]!=a[i+1]){
          //delete current position of duplicate element insert in new array
          a[j]=a[i];
          //the condition satisfied increase index j value
          j++;
        }
    }
    a[j]=a[n-1];
    System.out.println("\nElements with out duplicate values");
    for(int i=0;i<j+1;i++){
      System.out.print(a[i]+" ");
    }
  }
}