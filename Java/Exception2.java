package com.ust.example;

import java.io.*;
public class Exception2 {
	
	public static void findFile() throws IOException {
		
		// code that generate exception
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		
	}
	
	public static void main(String[] args) {
		try {
			findFile();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}

}
