import java.util.Scanner;

class BillElectric {
  public static void main(String[] args) {
    int cnu;
    String cna;
    float pmr;
    float lmr;
    float tu, eb;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Consumer Number : ");
    cnu = sc.nextInt();
    System.out.print("Enter Consumer Name : ");
    cna = sc.next();
    System.out.print("Enter Present Month Reading : ");
    pmr = sc.nextFloat();
    System.out.print("Enter Last Month Reading : ");
    lmr = sc.nextFloat();
    
    tu = pmr - lmr;

    System.out.println();
    System.out.println("The Consumer Number is : " + cnu);
    System.out.println("The Consumer Name is : " + cna);
    System.out.println("The Present Month Reading is : " + pmr);
    System.out.println("The Last Month Reading is : " + lmr);
    System.out.println();
    System.out.println("The Total present month unit is : " + tu);
    
    if(tu<=50)
    {
      System.out.println("The bill amount is "+(tu*1.45));
    }
    else if((tu>=51) && (tu<=100))
    {
      System.out.println("The bill amount is "+((50*1.45)+((tu-50)*2.56)));
    }
    else if((tu>=101) && (tu<=200))
    {
      System.out.println("The bill amount is "+((50*1.45+50*2.56)+((tu-100)*3.50)));
    }
    else if((tu>=201) && (tu<=300))
    {
      System.out.println("The bill amount is "+((50*1.45+50*2.56+100*3.50)+((tu-200)*4.67)));
    }
    else 
    {
      System.out.println("The bill amount is "+((50*1.45+50*2.56+100*3.50+100*4.67)+((tu-300)*5.67)));
    }
  }
}