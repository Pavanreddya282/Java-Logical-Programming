package com.JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) {
		
		Map<String, String> m = new HashMap<>();
		m.put("MyName", "Pavan");
		m.put("MyTown", "Srinivaspura");
		m.put("MyCity", "Bangalore");
		m.put("MyState", "Karnataka");
		m.put("MyPincode", "563138");
		
		//System.out.println(m);
		
		Set<String> keys = m.keySet();
		
		for(String key:keys) {
			System.out.println(key+"     "+m.get(key));
		}
	}

}
