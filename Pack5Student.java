import java.io.*;
class Pack5Student
  {
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(in);
       int n;
      String name;
      int s1,s2,s3;
      float tot,avg;
      System.out.println("Enter student number: ");
       n=Integer.parseInt(br.readLine());
      System.out.println("Enter the student name: ");
       name=br.readLine();
       System.out.println("Enter Subject1 marks: ");
       s1=Integer.parseInt(br.readLine());
       System.out.println("Enter Subject2 marks: ");
       s2=Integer.parseInt(br.readLine());
       System.out.println("Enter Subject3 marks: ");
       s3=Integer.parseInt(br.readLine());
      tot=s1+s2+s3;
      avg=tot/3;
      System.out.println(name+ " Report");
       System.out.println("--------------");
      System.out.println("Subject1 marks: "+s1);
      System.out.println("Subject2 marks: "+s2);
      System.out.println("Subject3 marks: "+s3);
      System.out.println("The total marks is: "+tot);
      System.out.println("The average marks is: "+avg);
    }
  }