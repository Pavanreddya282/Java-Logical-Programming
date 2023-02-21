import java.util.Scanner;
class SerAr
  {
      int i,j,t;
  Scanner sc=new Scanner(System.in);
  void getArray(int a[],int n){
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
  void dispArray(int a[],int n){
    for(i=0;i<n;i++){
      System.out.print("  "+a[i]);
    }
  }
    void Ser(int a[],int n,int ser){
    for(i=0;i<n;i++)
          {
            if(ser==a[i]){
              System.out.println(ser+" is Found");
              break;
            }
      }
      if (i==n){
        System.out.println(ser+" is not Found");
      }
    }
  }
    class SerAr{
  public static void main(String args[]){
    int i,n,ser;
    SerAr ad1=new SerAr();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array Size:");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter Elements to Array:");
    ad1.getArray(a,n);
    System.out.println("Enter the Element to search : ");
    ser=sc.nextInt();
     System.out.println("\nThe Elements After Sorting is:");
    ad1.dispArray(a,n);
  }
    }

