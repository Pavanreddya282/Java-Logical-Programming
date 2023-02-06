import java.util.*;
class Practice1{
  public static void main(String args[]){
    int n,i,n1=1,n2=0,n3=0;
    //int i=1,n,n1=1,n2=0,n3=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("How many times you want fibanacci series?");
    n=sc.nextInt();
    for(i=1;i<=n;i++){
    //while(i<=n){
      i++;
      System.out.print("\t"+n3);
      n3=n1+n2;
      n1=n2;
      n2=n3;
    }
    //System.out.println("\t"+n3);
  }
}