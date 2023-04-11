/*
Strings: In java String are used to text or sequence of charecters
Features of String:
* String is important inbuilt class in java.lang package.
* Storing sequence of data.
* Data should be enclosed in " " double quotes.
* Immutable- Strings once created cannot be changed.
*/
/*
// Program to explain immutability
class Practice46Strings
  {
    public static void main(String args[])
    {
      String s= "Reddy";
      s.concat("Pavan");//concat() method appends the string at the end
      System.out.println(s);//will print Reddy because strings are immutable objects  
      
      String s1=s.concat("Pavan");
      System.out.println(s1);
      //Concatination has happened above.
    }
  }
*/
/*
// Programs on String Comparision: 1. variable.equals(another variable)

class Practice46Strings{
  public static void main(String args[]){
    String s1="pavan";
    String s2="pavan";
    String s3=new String("pavan");
    String s4="Reddy";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
  }
}
*/
/*
//2. variable.equalsIgnoreCase(another variable)
class Practice46Strings{
  public static void main(String args[]){
    String s1="pavan";
    String s2="PAvAN";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));
  }
}
*/
/*
//3. Using == Operator
class Practice46Strings{  
 public static void main(String args[]){  
   String s1="Yuraj";  
   String s2="Yuraj";  
   String s3=new String("Yuraj");  
   System.out.println(s1==s2);//true (because both refer to same instance)  
   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
 }  
}
*/
/*
// String Conatination: 1. concat method.
class Practice46Strings{  
 public static void main(String args[]) {
   String s1="Pavan"+"33";
   String s2="Reddy";
   String s3=s1.concat(s2);
   System.out.println(s3);
 }
 }
*/
/*
// String concatenation using StringBuilder class
class Practice46Strings {
  public static void main(String args[]) {
    StringBuilder s1 = new StringBuilder("Pavan");// String 1
    StringBuilder s2 = new StringBuilder("Reddy");// String
    StringBuilder s = s1.append(s2);// String 3 to store the result
    System.out.println(s.toString());// Displays result
  }
}
*/
/*
//Substring: A part of String is called substring. In other words, substring is a subset of another String.

class Practice46Strings{
  public static void main(String args[]){
    String s="PavanReddy";
    System.out.println("Original String : "+s);// PavanReddy
    System.out.println("Substring starting from index 5 "+s.substring(5)); //Reddy
    System.out.println("Substring starting from index 0 to 5: "+s.substring(0,5));// Pavan
  }
}
*/
/*
//String Class Methods: 1. Java String toUpperCase() and toLowerCase() method
class Practice46Strings{
  public static void main(String args[]){
    String s="PavanReddy";
    System.out.println("Original String : "+s);// PavanReddy
    System.out.println(s.toUpperCase()); //PAVANREDDY
    System.out.println(s.toLowerCase());// pavanreddy
  }
*/
/*
//String Class Methods: 2. Trim: The String class trim() method eliminates white spaces before and after the String.

class Practice46Strings{
  public static void main(String args[]){
    String s="  PavanReddy   ";
    System.out.println("Original String : "+s);//   PavanReddy
    System.out.println(s.trim()); //PavanReddy
  }
}
*/
/*
//String Class Methods: 3. startsWith() and endsWith() method
class Practice46Strings {
  public static void main(String args[]) {
    String s = "PavanReddy";
    System.out.println(s.startsWith("Pa"));// true
    System.out.println(s.endsWith("y")); // true
  }
}
*/
/*
//String Class Methods: 4. charAt(), indexOf(), lastIndexOf() Methods
class Practice46Strings {
  public static void main(String args[]) {
    String s = "PavanReddy";
    System.out.println(s.charAt(5));// R
    System.out.println(s.charAt(0)); // P
    System.out.println(s.indexOf('e'));// 6
    System.out.println(s.lastIndexOf('a'));// 3
  }
}
*/
/*
//String Class Methods: 5. length() Method
class Practice46Strings {
  public static void main(String args[]) {
    String s = "PavanReddy";
    System.out.println(s.length());// 10
  }
}
*/
/*
//String Class Methods: 6. valueOf() Method- Convert data type to string

class Practice46Strings {
  public static void main(String args[]) {
    int a = 33;
    String s=String.valueOf(a); 
    System.out.println(s);// 33
  }
}
*/
/*
//String Class Methods: 7. replace() Method- replaces all occurrence of first sequence of character with second sequence of character.
class Practice46Strings {
  public static void main(String args[]) {
    String s = "A am Pavan, A am Programmer.";
    String replaceString = s.replace('A','I'); 
    System.out.println(replaceString);// 33
  }
}
*/
/*
// Mutable String: A String that can be modified or changed is known as mutable String. StringBuffer and StringBuilder classes are used for creating mutable strings.

//1. StringBuffer Class append() Method
class Practice46Strings {
  public static void main(String args[]) {
    StringBuffer s = new  StringBuffer("Pavan");
    s.append("reddy"); // now original string is changed
    s.append("A");
    System.out.println(s);
  }
}
*/
/*
//2. StringBuffer insert() Method

class Practice46Strings {
  public static void main(String args[]) {
    StringBuffer s = new  StringBuffer("PavaReddy");
    s.insert(4,"n"); // now original string is changed
    s.append("A");
    System.out.println(s);
  }
}
*/
/*
// 3. StringBuffer replace() Method

class Practice46Strings {
  public static void main(String args[]) {
    StringBuffer s = new  StringBuffer("PavanReddy");
    s.replace(0,5,"P"); // now original string is changed
    System.out.println(s);
  }
}
*/
/*
//StringBuffer delete() Method

class Practice46Strings {
  public static void main(String args[]) {
    StringBuffer s = new  StringBuffer("Hello");
    s.delete(1,3); // now original string is changed
    System.out.println(s);
  }
}
*/
/*
//StringBuffer reverse() Method

class Practice46Strings {
  public static void main(String args[]) {
    StringBuffer s = new  StringBuffer("Hello");
     // now original string is changed
    System.out.println(s.reverse());
  }
}
*/
/*
//StringBuffer capacity() Method

class Practice46Strings{
  public static void main(String args[]) {
    StringBuffer s=new StringBuffer();
    System.out.println(s.capacity());//default 16
    s.append("Hello Welcome");
    System.out.println(s.capacity());//now 16
    s.append("To My Beautiful World");
    System.out.println(s.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
  }
}
*/
// StringBuilder is Same as StringBuffer, it is Syncronized and it is not.