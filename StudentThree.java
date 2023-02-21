import java.util.Scanner;

class StudentThree {
  public static void main(String[] args) {
  
    float maths;
    float kannada;
    float science;
    float ta, pm;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter marks in Maths : ");
    maths = sc.nextFloat();
    System.out.print("Enter marks in kannada : ");
    kannada = sc.nextFloat();
    System.out.print("Enter marks in science : ");
    science = sc.nextFloat();
    
    ta = maths + kannada + science;
    pm = ta / 3;

    if (maths>=40 && kannada>=40 && science>=40)
    {
      System.out.println("Pass");
      if (pm<=50)
        System.out.println("with Grade C");
      else if(pm>=51&&pm<=70)
        System.out.println("with Grade B");
      else if(pm>=71&&pm<=80)
        System.out.println("with Grade A");
      else
        System.out.println("with Distinction");  
    }
    else
    {
      System.out.println("Fail");
    }
  }
}