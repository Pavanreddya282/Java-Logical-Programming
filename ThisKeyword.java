class Human {
  
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  /* by the this keyword it is easy no need to pass anything it wiil directly refer to current object*/
  public void setName(String name) {
    this.name = name;
  }

  // By accepting the object itself without using this keyword
  public void setAge(int age,Human h1) {
    h1.age = age;
  }

  public int getAge() {
    return age;
  }
}

class ThisKeyword {
  public static void main(String args[]) {
    Human h = new Human();
    h.setAge(26, h);// passing the object
    h.setName("Pavan");

    System.out.println(h.getName() + " : " + h.getAge());
  }
}