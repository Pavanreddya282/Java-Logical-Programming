
interface TotAvg
  {
    public void calc();
    public void disp();
  }
class StudentDetails implements TotAvg
  {
        int sno=33;
    String sname="PavanA";
    int sub1=56,sub2=45,sub3=85;
    int tot,avg;
    public void calc (){
      tot=sub1+sub2+sub3;
      avg=tot/3;
    }
    public void disp()
    {
      System.out.println("The Student Number is : "+sno);
      System.out.println("The Student Name is : "+sname);
      System.out.println("The total marks is : "+tot);
      System.out.println("The Student average is : "+avg);
    }
  }
class Inter1StudentRepo
  {
    public static void main(String args[]){
      StudentDetails s=new StudentDetails();
      s.calc();
      s.disp();
    }
  }