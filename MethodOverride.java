class Calc {
  public int add(int n1, int n2) {
    return n1 + n2;
  }
}

class AdvCalc extends Calc {
  public int add(int n1, int n2) {
    return n1 + n2 + 1;
  }
}

class MethodOverride {

  public static void main(String args[]) {
    AdvCalc obj = new AdvCalc();
    int r1 = obj.add(3, 1);
    System.out.println(" " + r1);
  }
}

/*
 * In above example the method in the sub class overide the method in super
 * class- for that the method name and th arguments should be same
 */