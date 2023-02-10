//Unary operator increament and decreament
class Practice6{
  public static void main(String args[]){
    /*int a=10;
    int b=a++;//first load value and then perform operation//
    System.out.println(a);
    System.out.println(b);*/
    /*int a=10;
    int b=++a;//first perform operation and then load value//
    System.out.println(a);
    System.out.println(b);*/
    /*int a=10;
    int b=a--;//first load value and then perform operation//
    System.out.println(a);
    System.out.println(b);*/
    /*int a=10;
    int b=--a;//first perform operation and then load value//
    System.out.println(a);
    System.out.println(b);*/
    int a=19;
    int exp;
    exp=(a++ + --a + a-- - --a - a-- - --a + a++ + ++a);
    System.out.println(exp);
  }
}