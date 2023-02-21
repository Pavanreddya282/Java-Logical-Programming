abstract class SimpleCalculator{
  abstract void calculate(int n);
  }
class SimpleCalculatorsum extends SimpleCalculator{
    void calculate(int n){
      System.out.println("The Sum is : "+(n+n));
    }
}
class SimpleCalculatorMultiply extends SimpleCalculator{
  void calculate(int n){
      System.out.println("The multiplication is : "+(n*n));
    }
}
class SimpleCalculatorSub extends SimpleCalculator{
  void calculate(int n){
      System.out.println("The sub is : "+(n-n));
    }
}

class Abs1
  {
    public static void main( String args[]){
      SimpleCalculatorsum n1=new SimpleCalculatorsum();
      SimpleCalculatorMultiply n2=new SimpleCalculatorMultiply();
      SimpleCalculatorSub n3=new SimpleCalculatorSub();
      n1.calculate(6);
      n2.calculate(7);
      n3.calculate(8);
    }
  }
  