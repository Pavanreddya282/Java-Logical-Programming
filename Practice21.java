// while loop use when we don't know number of iterations
//WAP to print sum of all even number 1-20
/*class Practice21{
  public static void main(String args[]){
    int e=1;
    int sum=0;
    while(e<=20){
      if(e%2==0){
        sum=sum+e;
      }
      e++;
    }
    System.out.println("sum of all even numbers between is : "+sum);
  }
}*/

// WAP to find factorial of a given number

class Practice21{
  public static void main(String args[]){
    int n=5;
    int fact=1;
    while(n>=1){
        fact=fact*n;
      n--;
    }
    System.out.println("Factorial is " +fact);
  }
}