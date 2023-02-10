// WAP to check perfect number

/*class Practice20 {
  public static void main(String args[]) {
    int n = 28;
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum = sum + i;
      }
    }
    if (n == sum) {
      System.out.println("It is a perfect number");
    } else
      System.out.println("It is not a perfect number");
  }
}*/

// Fibanacci Series for given length

class Practice20{
  public static void main(String args[]){
    int length=8;
    int n1=0,n2=1;
    for(int i=0;i<=length;i++){
      int n3=n1+n2;
      System.out.print("\t"+n3);
      n1=n2;
      n2=n3;
    }
  }
}