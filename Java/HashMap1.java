package com.ust.example;

import java.util.*;

public class HashMap1 {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>();
		hm1.put(3,  "Geeks");
		hm1.put(2,  "For");
		hm1.put(1, "Geeks");
		System.out.println("Mappings of LinkedHashMap:" + hm1);
	}

}
