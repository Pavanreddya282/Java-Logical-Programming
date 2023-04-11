class Mobile {
  // String brand;
  // int price;
  // static String name;

  public Mobile() {
    // brand = "samsung";
    // price = 1200;
    System.out.println("in Constructor");
  }

  static {
    // name = "phone";
    System.out.println("in Static Block");
  }
}

public class StaticBlock {
  public static void main(String args[]) {
    Mobile m1 = new Mobile();
    Mobile m2 = new Mobile();
    // Constructor is claled to times because two objects created
    // static block is called once irrespective of how many objects created
    // static block is called on priority
  }

}