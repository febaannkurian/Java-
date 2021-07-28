package com.ust.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileExample2 {

	public static void main(String[] args) {
		try {
//			FileInputStream input = new FileInputStream("C:\\Users\\ustjava25\\input.txt");
//			System.out.println("Data in the file");
//			// Reads the first byte
//			int i = input.read();
//			while(i != -1) {
//				System.out.println((char)i);
//				i = input.read();
//			}
//			input.close();
			// deals with byte values
			
			String s = "Write something";
			FileOutputStream output = new FileOutputStream("C:\\Users\\ustjava25\\input.txt");
		   output.write(s.getBytes());
		   output.close();
		
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
