import java.util.Scanner;
  
 class Bill
 {
  void now()
  {
    int pnu;
    String pna;
    float pcost;
    float pqty;
    float ta;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Product Number : ");
    pnu=sc.nextInt();
    System.out.println("Enter the Product Name : ");
    pna=sc.next();
    System.out.println("Enter the Product Cost : ");
    pcost=sc.nextFloat();
    System.out.println("Enter the Product Quantity : ");
    pqty=sc.nextFloat();

    ta=pcost*pqty;
    System.out.println("The Product Name is : "+pnu);
    System.out.println("The Total is : "+ta);
    
    
  }
 }

class ProductBill
  {
  public static void main(String args[])
    {
    Bill m = new Bill();
    m.now();
    }  
  }
    
     


  
    

