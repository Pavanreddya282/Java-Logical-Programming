class Calc{
  public int add(int n1, int n2){
    return n1+n2;
  }
  public int sub(int n1, int n2){
    return n1-n2;
  }
}
class AdvCalc extends Calc {
  public int multi(int n1, int n2){
    return n1*n2;
  }
  public int div(int n1, int n2){
    return n1/n2;
  }
}
class VeryAdvCalc extends AdvCalc {
  public double pow(int n1, int n2){
    return Math.pow(n1, n2);
  }
}
class Inheritance{
  public static void main(String args[]){
    VeryAdvCalc c=new VeryAdvCalc();
    int r1=c.add(4, 5);
    int r2=c.sub(5, 2);
    int r3=c.multi(5, 3);
    int r4=c.div(15, 4);
    double r5=c.pow(5, 2);

    System.out.println(r1+" " +r2+" "+r3+" "+r4+" "+r5);
  }
}