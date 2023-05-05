package com.JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(4);
		values.add(9);
		values.add(2);
		values.add(6);
		values.add(8);
		
		Collections.sort(values);
		
		for(int i : values) {
			System.out.println(i);
		}
	}
}
