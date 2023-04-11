class Mobile {
  String brand;
  int price;
  static String name;

  public void show() {
    System.out.println(brand + " : " + price + " : " + name);
  }

  // u can use only static variable in static method directly
  // the jvm gets confused to show which values for brand and price because those
  // are non static to avoid that confusion we will create a object reference
  public static void show1(Mobile m) { // Accepted the Object reference
    System.out.println(m.brand + " : " + m.price + " : " + name);
  }
}

public class StaticMethod {
  public static void main(String args[]) {
    Mobile m1 = new Mobile();
    m1.brand = "Apple";
    m1.price = 1500;
    Mobile.name = "SmartPhone";

    Mobile m2 = new Mobile();
    m2.brand = "Samsung";
    m2.price = 1700;

    m1.show();
    m2.show();
    Mobile.show1(m1);// created a object reference and sent to static method
    // now without confusion it will get m1 object values
  }
}

// main method is static because it is "starting point" of executing any code
// or else we need to create object reference just like other methods
// "if we not start the program then how can we create a object..." // so in
// conclusion we cannot create a main method without static