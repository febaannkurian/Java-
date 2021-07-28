package com.ust.example;

class GenericsClass1 <T extends Number> {
	public void display() {
		System.out.println("This is a bounded type generic class");
		
	}
}
public class Collection12 {
	
	public static void main(String[] args) {
		GenericsClass1<Float> obj = new GenericsClass1<>();
		obj.display();
	}

}
