class Mobile {
  String brand;
  int price;
  static String name;

  public void show() {
    System.out.println(brand + " : " + price + " : " + name);
  }
}

class StaticVariable {
  public static void main(String args[]) {
    Mobile m1 = new Mobile();
    m1.brand = "apple";
    m1.price = 1500;
    m1.name = "SmartPhone";

    Mobile m2 = new Mobile();
    m2.brand = "samsung";
    m2.price = 1700;
    m2.name = "SmartPhone";

    // m1.name="MobilePhone"; // the vlaue of m1 object and m2 object is also
    // changed just because the variable is static

    // instead of calling with object name we should call
    // static variable by class name
    Mobile.name = "MobilePhone";

    m1.show();
    m2.show();
  }
}