class override1
  {
    void disp(){
      int n=12;
      if (n%2==0){
        System.out.println("It is even");
      }else
        System.out.println("It is odd");
    }
  }
class override extends override1{
  void disp(){
    int n=13;
      if(n%2==1){
        System.out.println("It is odd");
      }else
        System.out.println("It is even");
  }
}
class Poly2MthdOveriding{
  public static void main(String args[]){
    override1 a1= new override1();
    override  a2= new override();
    override1 b;
    b=a1;
    b.disp();
    b=a2;
    b.disp();
  }
}