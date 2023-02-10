// WAP find factors of a given number
/*class Practice18{
  public static void main(String args[]){
    int n=12;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        System.out.print(i+" ");
      }
    }
  }
}*/

//WAP Count the factors

class Practice18{
  public static void main(String args[]){
    int n=12,count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
    System.out.print(count+" ");
  }
}