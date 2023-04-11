/* it is not compolsory to derive abstract methods in abstract class But when we have abstract method the class should be abstract
 when we create a abstract method in abstract class that should be implemented in next concrete class

 Concrete class is where all the abstract methods are defined
 
 we cannot create a object of abstract class we should always create object of concrete class*/

/* Abstract is abstract idea to implement in future updates which is defined and derived as below. */
abstract class Car { // abstract class

  // Abstract Methods
  public abstract void drive();

  public abstract void fly();

  public void playMusic() {
    System.out.println("Playing Music");
  }
}

abstract class Fortuner extends Car {

  public void drive() {
    System.out.println("Driving..");
  }
}

class UpdatedFortuner extends Fortuner { // Concrete class
  public void fly() {
    System.out.println("Flying..");
  }
}

class AbstractKey {
  public static void main(String args[]) {

    // ObjectReference ObjectReferenceName = new Object;
    Car obj = new UpdatedFortuner();
    obj.playMusic();
    obj.drive();
    obj.fly();
  }
}