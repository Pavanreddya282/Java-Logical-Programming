class Student {
  int rollno;
  String name;
}

class StudentArray {
  public static void main(String args[]) {

    // creating objects of the class
    // adding objects to the array
    Student s1 = new Student();
    s1.rollno = 33;
    s1.name = "pavan";

    Student s2 = new Student();
    s2.rollno = 35;
    s2.name = "power";

    Student s3 = new Student();
    s3.rollno = 28;
    s3.name = "reddy";
    // Creating array of students
    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].rollno + ":" + students[i].name);
    }

    System.out.println("_--------_");
    // Using for each loop
    for (Student stud : students) {
      System.out.println(stud.rollno + ":" + stud.name);
    }
  }
}