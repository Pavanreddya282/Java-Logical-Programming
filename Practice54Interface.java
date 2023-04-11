//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
interface Animal1{
  public void animalSound();
  public void sleep();
}
class Pig1 implements Animal1{
  public void animalSound(){
    System.out.println("The pig says: wee wee");
  }
  public void sleep(){
    System.out.println("Zzz");
  }
}
class Practice54Interface{
  public static void main(String args[]){
    Pig1 myPig =new Pig1();
    myPig.animalSound();
    myPig.sleep();
  }
}
/*
//Interface declaration: by first user  
interface Drawable{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){
  System.out.println("drawing rectangle");
}  
}  
class Circle implements Drawable{  
public void draw(){
  System.out.println("drawing circle");
}  
}  
//Using interface: by third user  
class Practice54Interface{  
public static void main(String args[]){  
Drawable d=new Rectangle();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
}
}  
*/
/*
interface Bicycle{
  
  void applyBrake(int decrement);// interface method (does not have a body)
  void speedUp(int increment);// interface method (does not have a body)
}
// create one more class to implement interface "Bicycle"
class MountainBike implements Bicycle{
  // Initialize the datatype and variables
  private int seatHeight;
  private int gear;
  private int speed;
  // Create a constructor method to initialize 
  public MountainBike(int startHeight,int startGear,int startSpeed){
    seatHeight=startHeight;
    gear=startGear;
    speed=startSpeed;
  }
  //@override 
  public void applyBrake(int decrement){
      speed= speed-decrement;
  }
  //@override
  public void speedUp(int increment){
    speed =speed+increment;
  }
  //@param seatHeight to set seat hieght
  public void setseatHeight(int newValue){
    seatHeight=newValue;
  }
  //@param gear to set gear
  public void setGear(int newValue){
    gear=newValue;
  }
  //@return speed
  public int getSpeed(){
    return speed;
  }
  //@return seatHeight
  public int getseatHeight(){
    return seatHeight;
  }
  //@return gear
  public int getGear(){
    return gear;
  }
}
class Practice54Interface{
  public static void main(String args[]){
    MountainBike mb=new MountainBike(20,1,10);
    System.out.println("The starting seat height is "+mb.getseatHeight());
    System.out.println("The starting Gear is  "+mb.getGear());
    System.out.println("The starting speed is  "+mb.getSpeed());
    mb.applyBrake(5);
    System.out.println("The speed after applying brake "+mb.getSpeed());
    mb.setseatHeight(25);
    System.out.println("The seat height after alter "+mb.getseatHeight());
    mb.setGear(3);
    System.out.println("The gear now "+mb.getGear());
    mb.speedUp(50);
    System.out.println("The speed now  "+mb.getSpeed());
    mb.setGear(5);
    System.out.println("The gear now "+mb.getGear());
    mb.speedUp(50);
    System.out.println("The speed now  "+mb.getSpeed());

    System.out.println("The rider is in highspeed");
  }
}
*/
