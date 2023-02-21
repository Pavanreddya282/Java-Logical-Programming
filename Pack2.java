import java.io.*;
class Pack2
  {
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(in);
      float f;
      System.out.println("Enter Any float value:");
       f=Float.parseFloat(br.readLine());
       System.out.println("The Given float is:"+f);
    }
  }