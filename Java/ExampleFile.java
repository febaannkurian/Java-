package com.ust.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExampleFile {
	
	public static void main(String[] args) {
		
		try {
				
		File f = new File("D:File1.txt");
//		if(f.createNewFile()) {
//			System.out.println(f.getName()+ "is created");
//		} else {
//			System.out.println("Already exist");
//		}
//		f.write("This is java training");
//		Scanner read = new Scanner(f);
//		} catch(IOException e) {
//			System.out.println("Exception occured");
//		}
		FileReader read = new FileReader(f);
		
		int ch;
		while((ch = read.read())!= -1) {      
			System.out.println((char)ch);
		}
		read.close();
	}
		catch(IOException e) {
			System.out.println("Exception occured");
		}
	}

}
