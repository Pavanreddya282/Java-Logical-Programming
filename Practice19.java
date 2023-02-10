//WAP given prime or not
class Practice19{
  public static void main(String args[]){
    int n=13;
    int count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
    if(count==2){
        System.out.println("It is prime Number");
      }
        else{
          System.out.println("It is not prime Number");
        }
  }
}