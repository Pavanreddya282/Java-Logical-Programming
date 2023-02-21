class Factors{
  int n=12,i;
  void Fact(){
    for(i=1;i<=n;i++)
     if(n%i==0)
       System.out.println(i+" is the factors of " +n+" ");
  }
  void Fact(int f){
     int n=12,count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        count++;
      }
    }
    System.out.println(count+" is total Number of Factors");
  }
}
class Poly1MthdOverloading
  {
    public static void main(String args[]){
      Factors f1=new Factors();
      f1.Fact();
      f1.Fact(12);
    }
  }
