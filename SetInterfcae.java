package com.JavaPractice;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfcae {
	
	public static void main(String[] args) {
		//Set<Integer> values = new HashSet<Integer>();
		Set<Integer> values = new TreeSet<Integer>();
		values.add(36);
		values.add(49);
		values.add(33);
		System.out.println(values.add(28));
		values.add(31);
		System.out.println(values.add(28)); // Cannot add Duplicate values in Set
		
		for(int i:values) {
			System.out.println(i);
		}
	}

}
