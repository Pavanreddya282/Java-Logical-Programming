package com.JavaPractice;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.Iterator;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
//		Collection values = new ArrayList();
		Collection<Integer> values = new ArrayList<Integer>();
		values.add(3);
		values.add(2);
		values.add(8);
		values.add(10);
		
		//Iterator i =values.iterator();
		//Iterator<Integer> i =values.iterator();
		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		for(Object o: values) {
//			System.out.println(o);
//		}
//		for(Integer o:values) {
//			System.out.println(o);
//		}
		for(int obj:values) {
			System.out.println(obj);
		}
	}

}
