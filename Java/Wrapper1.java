package com.ust.example;

public class Wrapper1 {
	public static void main(String[] args) {
		
	
	int i = 5;
	Integer obj = new Integer(i);
	int j = obj.intValue();
	double d = 5.5;
	System.out.println(j);
	Double obj1 = new Double(d);
	Double dd = obj.doubleValue();
	System.out.println(d);

}
}
