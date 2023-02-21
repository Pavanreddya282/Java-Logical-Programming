class even
{
  void disp(){
    int sum=0;
    for(int i=100;i>=50;i--){
      if(i%2==1){
        sum=sum+i;
      }
    }
    System.out.println(sum);
  }
}
class even1 extends even{
  void disp()
  {
    super.disp();
    int count=0;
    for(int i=1;i<=599;i++){
      if(i%2==0){
        count++;
      }
    }
    System.out.println(count);
  }
}
class Sup1
  {
    public static void main(String args[]){
      even1 e=new even1();
      e.disp();
    }
  }
