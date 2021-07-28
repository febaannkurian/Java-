package com.ust.example;

public class Exception7 {
	
	public static void main(String[] args) {
		try {
			Exception7 exc = new Exception7();
			System.out.println("length of FEBA is " +exc.getStringSize("FEBA"));
			System.out.println("length of ANN is " +exc.getStringSize("ANN"));
			System.out.println("length of null string is " +exc.getStringSize(null));
			
		} catch (Exception ex) {
			System.out.println("Exception message " + ex.getMessage());
		}
	}
	
	public int getStringSize(String str) throws Exception {
		if(str == null) {
			throw new Exception("String input is null");
		}
		return str.length();
	}

}
