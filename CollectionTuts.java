package com.JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTuts {
	
	public static void main(String[] args) {
		
		List<Student> stud= new ArrayList<>();
		
		stud.add(new Student(1,55));
		stud.add(new Student(2,65));
		stud.add(new Student(3,85));
		stud.add(new Student(4,75));
		stud.add(new Student(5,35));
		stud.add(new Student(6,45));
		
		Collections.sort(stud, (s1, s2) ->{
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
		});
		for(Student s:stud) {
			System.out.println(s);
		}
	}

}
class Student{
	
	int rollNo;
	int marks;
	
	//Constructor
	public Student(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
}