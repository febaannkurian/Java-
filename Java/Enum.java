package com.ust.example;

import java.util.Enumeration;
import java.util.Hashtable;

public class Enum {

	public static void main(String[] args) {
		Enumeration names;
		String key;
		Hashtable<String,String> hashtable = new Hashtable<String, String>();
		hashtable.put("Key1", "Feba");
		hashtable.put("Key2", "Irin");
		hashtable.put("Key3", "Niya");
		hashtable.put("Key4", "Devika");
		hashtable.put("Key5", "Anjali");
		
		names = hashtable.keys();
		while(names.hasMoreElements()) {
			key = (String)names.nextElement();
			System.out.println("Key: " + key + " & Value: " + hashtable.get(key));
		}
	}
}
