interface Computer {
  void code();

}

class Laptop implements Computer {
  public void code() {

    System.out.println("Laptop is esier to code run and compile");
  }
}

class Desktop implements Computer {
  public void code() {

    System.out.println("Desktop is faster to code run and compile");

  }
}

class Developer {
  public void devApp(Computer com) {
    com.code();
  }
}

class Interface {
  public static void main(String args[]) {

    Computer lap = new Laptop();
    Computer desk = new Desktop();

    Developer pavan = new Developer();

    pavan.devApp(lap);
  }
}