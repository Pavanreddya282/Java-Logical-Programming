//Arrays:- An array is a collection of similar types of data.
/*
Example1
class Practice41Arrays
  {
    public static void main(String args[])
    {
      int age[]={12,5,8,10};
        System.out.println("First element "+age[0]);
      System.out.println("Second element "+age[1]);
      System.out.println("Third element "+age[2]);
      System.out.println("Fourth element "+age[3]);
    }
  }
*/
/*
//Example2
class Practice41Arrays
  {
    public static void main(String args[])
    {
      int age[]={12,5,8,10};
// using for loop
      for (int i =0;i<age.length; i++){
        System.out.println(" "+age[i]);
      }
    }
  }
*/
/*
//Example3
class Practice41Arrays
  {
    public static void main(String args[])
    {
      int age[]={12,5,8,10};
      // using for-each loop
      for (int a:age){
        System.out.println(" "+a);
      }
    }
  }
*/

//Example4
//Sum and Average of an array
class Practice41Arrays
  {
    public static void main(String args[])
    {
      int sum=0;
      double average;
      int numbers[]={12,5,8,10,-2,6,0,-55,70,4,6};
      // using for-each loop
      for (int number:numbers){
        sum+=number;
      }
      int al=numbers.length;
      System.out.println(al);
      average= ((double) sum/(double)al);
      System.out.println("The Sum of array is : "+sum);
      System.out.println("The Average of array is : "+average);
    }
  }