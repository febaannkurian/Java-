package com.ust.example;

import java.io.*;

class ThrowExample {
	void myMethod(int num) throws IOException, ClassNotFoundException {
		if(num == 1)
			throw new IOException("IOException Occured");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}
}

public class Exception5 {
	
	public static void main(String[] args) {
		try {
			ThrowExample obj = new ThrowExample();
			obj.myMethod(2);
		} catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
