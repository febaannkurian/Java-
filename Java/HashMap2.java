package com.ust.example;

import java.util.*;
public class HashMap2 {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(3,  "Geeks");
		hm.put(2, "For");
		hm.put(1, "Geeks");
		for(Map.Entry<Integer, String> mapElement : hm.entrySet()) {
			Integer key = mapElement.getKey();
			String value = mapElement.getValue();
			System.out.println(key + " : " + value);
		}
	}

}
