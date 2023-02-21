import java.util.Scanner;

class Seasons{
  public static void main(String args[]) {
    int m;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter month number to know season :");
    m = sc.nextInt();
    switch(m)
    {
        case 3: case 4:case 5:case 6:
        System.out.println("Summer Hot");
        break;
        case 7: case 8:case 9:case 10:
        System.out.println("Winter Cold");
        break;
        case 11: case 12:case 13:case 14:
        System.out.println("Rainy Season");
        break;
        default:
        System.out.println("Enter Valid Month");  
    }
  }
}
