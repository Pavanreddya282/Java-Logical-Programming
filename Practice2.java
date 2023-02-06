import java.util.Scanner;
class Practice2{
  public static void main(String args[]){
    int n,t,sum=0,rem;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number : ");
    n=sc.nextInt();

    t=n;
    while(n>0){
      rem=n%10;
      sum=sum+(rem*rem*rem);
      n=n/10;
      
    }
    if(t==sum){
      System.out.println("It is armstrong number");
    }
    
  }
}
