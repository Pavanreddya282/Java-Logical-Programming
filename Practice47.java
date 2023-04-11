
/* 
//Program1:Write a JAVAprogram to find length of a string and compare and concatenate two strings.

import java.util.*;
class Practice47
  {
    public static void main(String args[])
    {
      String s1,s2;
      Scanner sc= new Scanner (System.in);
      System.out.println("Enter the string");
      s1=sc.next();
      System.out.println("Enter the string");
      s2=sc.next();
      System.out.println("The String 1 length "+s1.length());
      int length=s2.length();
      System.out.println("The String 2 length "+length);
      if(s1.length() ==s2.length()){
        System.out.println("Both lengths are equal");
      }
      else
        System.out.println("Both lengths are not equal");
      if(s1.equalsIgnoreCase(s2)){
        System.out.println("Both strings are equal");
      }
      else
        System.out.println("Both strings are not equal");
      System.out.println("After conctination "+s1.concat(s2));
    }
  }
*/
/*
// Program2: Write a JAVAprogram to find total number of alphabets, digits or special character in a string.

import java.util.*;

class Practice47 {
  public static void main(String args[]) {
    String s;
    int c1 = 0, c2 = 0, c3 = 0;
    int i;
    char temp;// temporary variable to store & compare each char of String
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    s = sc.nextLine();
    String s1=s.toLowerCase();
    System.out.println(s1);
    for (i = 0; i < s1.length(); i++) {
      temp = s1.charAt(i);
      if (Character.isAlphabetic(temp)) {
        c1++;
      } else if (Character.isDigit(temp)) {
        c2++;
      } else
        c3++;
    }
    System.out.println("Alphabets " + c1 + ", Numbers " + c2 + ",Special Charecters " + c3);
  }
}
*/
/*
//Program3: Write a JAVAprogram to count total number of vowels and consonants in a string.

import java.util.*;
class Practice47 {
  public static void main(String args[]) {
    int i;
    int c1=0,c2=0;
    char temp;// temporary variable to store & compare each char of String
    Scanner sc = new Scanner(System.in);
    StringBuffer s= new StringBuffer();// Stored in the StringBuffer object s
    System.out.println("Enter the string");
    s.append(sc.nextLine()); //Append user defined to object
    String st=s.toString(); //The toString() method is used to convert the StringBuffer object to a String
    String s1=st.toLowerCase();//which is then converted to lowercase using the toLowerCase() method.
    //System.out.println(s1);
    for(i=0;i<s1.length();i++){
      temp=s1.charAt(i);
      if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
        c1++;
      }else
        c2++;
    }
    System.out.println("Vowels " + c1 + ", Consonents " + c2);
  }
}
*/
/*
//Program4: Write a JAVAprogram to count total number of words in a string.

class Practice47 {
    public static void main(String args[]) {
      int c=1;
      StringBuffer s=new StringBuffer("Hi Welcome to bitlabs");
      s.append(" learn the Programming");
      System.out.println(s);
      for(int i=0;i<s.length()-1;i++){
        if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
          c++;
      }
      System.out.println("Number of words "+c);
    }
  }
*/

/*
//Program5:Method1:Write a JAVAprogram to find reverse of a string.

class Practice47 {
    public static void main(String args[]) {
      String rev="";
      StringBuffer s=new StringBuffer("Hi Welcome to bitlabs");
      s.append(" learn the Programming");
      System.out.println(s);
      for(int i=s.length()-1;i>=0;i--){
        rev=rev+s.charAt(i);
      }
      System.out.println("Reverse of String : " +rev);
    }
}
*/

/*
//Write a JAVAprogram to check whether a string is palindrome or not.
class Practice47 {
  public static void main(String args[]) {
    String rev="";
    StringBuffer s=new StringBuffer();
    s.append("Madam");
    String st=s.toString();

    for(int i=st.length()-1;i>=0;i--){
      rev=rev+st.charAt(i);
    }
    System.out.println("Reverse of String : " +rev);
    
    System.out.println("\nWhen using equals() method");
    if(st.equals(rev)){
      System.out.println("It is Palindrome String");
    }else{
      System.out.println("It is not Palindrome String");
    }
    System.out.println("\nWhen using equalsIgnore() method");
    if(st.equalsIgnoreCase(rev)){
      System.out.println("It is Palindrome String");
    }else{
      System.out.println("It is not Palindrome String");
    }
  }
}
*/
// Write a JAVAprogram to count frequency of each character in a string
import java.util.*;
class Practice47 {
    public static void main(String args[]) {
      String s;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String");
      s=sc.nextLine();
      s=s.toLowerCase();
      System.out.println("\n"+"The frequecy of each character in the given string is: ");
      for(char ch='a';ch<='z';ch++){
        int count=0;
        for(int i=0;i<s.length();i++){
          if(ch==s.charAt(i)){
          count++;
          }
        }
        if(count!=0){
          System.out.println(ch+"===>"+count);
        }
      }
    }
  }