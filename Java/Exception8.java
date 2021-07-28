package com.ust.example;
/// multiple catch block

public class Exception8 {
	
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6] = 30 / 0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println("Parent Exception ");
		}
		System.out.println("Rest of code");
	}

}
