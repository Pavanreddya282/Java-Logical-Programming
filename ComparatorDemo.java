package com.JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		List<Integer> values= new ArrayList<Integer>();
		
		values.add(333);
		values.add(532);
		values.add(331);
		values.add(286);
		values.add(954);
		
//		Collections.sort(values);
//		Collections.reverse(values);
		
//		Comparator<Integer> com= new ComImpl();
//		Collections.sort(values, com);
		//instead of creating separate class can create anonymous class
		
//		Comparator<Integer> com = new Comparator<Integer>()
//		{
//			public int compare(Integer o1, Integer o2) 
//			{
//				if(o1%10 > o2%10)
//					return 1;
//				return -1;
//			}
//		};
//		
//		Collections.sort(values, com);
		
		// Using Lambda Expressions
		
//		Comparator<Integer> com = (o1, o2) -> 
//			{
//				if(o1%10 > o2%10)
//					return 1;
//				return -1;
//			};
//		
//		Collections.sort(values, com);
		
		// Using Ternary Operator
		
		Comparator<Integer> com = (o1, o2) -> 
		{
			return o1%10>o2%10?1:-1;
		};
	
	Collections.sort(values, com);
		
		for(int i:values) {
			System.out.println(i);
		}
	}

}
