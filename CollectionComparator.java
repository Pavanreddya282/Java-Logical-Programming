// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// import java.util.Comparator;

// class Student1 {
// int age;
// String name;

// public Student1(int age, String name) {
// this.age = age;
// this.name = name;
// }

// public String toString() {
// return "Student [age=" + age + ", Name= " + name + "]";
// }
// }

// class CollectionComparator {

// public static void main(String args[]) {

// Comparator<Student1> com = new Comparator<Student1>() {
// public int compare(Student1 i, Student1 j) {
// if (i.age > j.age)
// return 1;
// else
// return -1;
// }
// };

// List<Student1> studs = new ArrayList<>();
// studs.add(new Student1(30, "power"));
// studs.add(new Student1(58, "nolan"));
// studs.add(new Student1(26, "pavan"));
// studs.add(new Student1(25, "navan"));

// Collections.sort(studs, com);

// for (Student1 s : studs)
// System.out.println(s);

// }
// }

// We can use comparable and need to use copmaTo Method

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1> {
  int age;
  String name;

  public Student1(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String toString() {
    return "Student [age=" + age + ", Name= " + name + "]";
  }

  public int compareTo(Student1 that) {
    if (this.age > that.age)
      return 1;
    else
      return -1;

  }

}

class CollectionComparator {

  public static void main(String args[]) {

    // Comparator<Student1> com = new Comparator<Student1>() {
    // public int compare(Student1 i, Student1 j) {
    // if (i.age > j.age)
    // return 1;
    // else
    // return -1;
    // }
    // };

    List<Student1> studs = new ArrayList<>();
    studs.add(new Student1(30, "power"));
    studs.add(new Student1(58, "nolan"));
    studs.add(new Student1(26, "pavan"));
    studs.add(new Student1(25, "navan"));

    Collections.sort(studs);

    for (Student1 s : studs)
      System.out.println(s);

  }
}