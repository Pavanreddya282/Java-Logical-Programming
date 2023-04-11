/* Methods:- Methods are set of instructions written by the programmers in order to perform specific task
Using methods we can achive "code reusibility".
Using methods we can increase "modularity" ex:- Structured way of programming
*/
// WAP Method that accepts two double value and returns nothing
/*
class Practice28
  {
    public static void main(String args[])
    {
      Method1(10.12,10.12);
    }
    public static void Method1(double a,double b)
    {
      System.out.println(a);
      System.out.println(b);
    }
  }
*/
//WAP Method that accepts two boolean value and returns nothing
/*
class Practice28Methods
  {
    public static void main(String args[])
    {
      //Method1(true,false);
      boolean c=true;
      boolean d=false;
      Method1(c,d);
    }
    public static void Method1(boolean a, boolean b)
    {
      System.out.println(a);
      System.out.println(b);
    }
  }
*/

//WAP Method that accepts one char,one string, one int vlaue and returns nothing
/*
class Practice28Methods
  {
    public static void main(String args[])
    {
      Method1('P',"Reddy",331);
    }
    public static void Method1(char c,String d, int e)
    {
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
    }
  }
*/
//WAP Method that accepts two float, one byte, one char vlaue and returns nothing
/*
class Practice28Methods
  {
    public static void main(String args[])
    {
      Method1(3.1f, 3.3f, 5,'P');
    }
    public static void Method1(float a,float b, int c,char d)
    {
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
    }
  }
*/

// Passing nothing to a method but returning some value from the method.
/*
class Practice28Methods
  {
    public static void main(String args[])
    {
      System.out.println("Hi");
      int x= Method2();
      System.out.println("Bye");
    }
    public static int Method2()
    {
      //System.out.println("in Method2");
      return 100;
    }
  }
*/
/*
class Practice28Methods
  {
    public static void main(String args[])
    {
      System.out.println("Hi");
      char x= Method2();
      System.out.println(x);
    }
    public static char Method2()
    {
      return 'P';
    }
  }
*/
// Passing nothing to a method but returning some value from the method.
/*
class Practice28Methods
  {
    public static void main(String args[])
    {
      System.out.println("Hi");
      int x=Method1(10,20);
      System.out.println(x);
      System.out.println("Bye");
    }
    public static int Method1(int a,int b)
    {
      System.out.println("in Method1");
      System.out.println(a);
      System.out.println(b);
      return 100;
    }
  }
*/

//WAP Method that accepts two string vlaue and return float vlaue
/*
class Practice28Methods {
  public static void main(String args[]) {
    String s1 = "pavan";
    String s2 = "reddy";
    float f = Method1(s1, s2);
    System.out.println(f);
  }

  public static float Method1(String s1, String s2) {
    System.out.println("A");
    System.out.println(s1);
    System.out.println(s2);
    return 100.1f;
  }
}
*/