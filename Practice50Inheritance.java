// Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.

/*
//Single Inheritance

class Animal{
  void eat(){
    System.out.println("Eating..");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("Barking..");
  }
}
class Practice50Inheritance
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
      d.eat();
      d.bark();
    }
  }

*/
// Hierarchical Inheritance : When two or more classes inherits a single class, it is known as hierarchical inheritance.

class Animal{
  void eat(){
    System.out.println("Eating..");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("Barking..");
  }
}
class Cat extends Animal{
  void mew(){
    System.out.println("Meaoowww..");
  }
}
class Practice50Inheritance
  {
    public static void main(String args[])
    {
      Cat c=new Cat();
      c.eat();
      c.mew();
      //c.bark(); //CT Error
    }
  }

