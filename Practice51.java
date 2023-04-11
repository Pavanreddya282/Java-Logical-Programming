class Bicycle{
  int gear;
  int speed;
  public Bicycle(int StartGear, int StartSpeed){
    gear=StartGear;
  speed =StartSpeed;
  }
  public void setGear(int newValue){
    gear =newValue;
  }
  public void applyBrake(int decrement){
    speed -= decrement;
  }
  public void speedUp(int increment){
    speed += increment;
  }
}
class MountainBike extends Bicycle{
    int seatHeight;
    public MountainBike(int StartGear, int StartSpeed,int startHeight){
      super(StartGear,StartSpeed);
      seatHeight = startHeight;
    }
    public void setHeight(int newValue){
      seatHeight=newValue;
    }
}
class Practice51{
  public static void main(String args[]){
    MountainBike mb = new MountainBike(1,10,20);
    System.out.println("The starting seat height is "+mb.seatHeight);
    System.out.println("The starting Gear is  "+mb.gear);
    System.out.println("The starting speed is  "+mb.speed);

    mb.applyBrake(5);
    System.out.println("The speed after applying brake "+mb.speed);
    mb.setHeight(25);
    System.out.println("The seat height after alter "+mb.seatHeight);
    mb.setGear(3);
    System.out.println("The gear now "+mb.gear);
    mb.speedUp(50);
    System.out.println("The speed now  "+mb.speed);
    mb.setGear(5);
    System.out.println("The gear now "+mb.gear);
    mb.speedUp(50);
    System.out.println("The speed now  "+mb.speed);

    System.out.println("The rider is in highspeed");
  }
}