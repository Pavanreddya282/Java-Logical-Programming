class Human {
  /*
   * creating instance variables with private access modifier which can be
   * accessed within class but we mant those outside class for that we use getter
   * method
   */
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String n) {
    name = n;
  }

  public void setAge(int a) {
    age = a;
  }

  public int getAge() {
    return age;
  }
}

class Encapsulation {
  public static void main(String args[]) {
    Human h = new Human();
    h.setAge(26);
    h.setName("Pavan");

    System.out.println(h.getName() + " : " + h.getAge());
  }
}