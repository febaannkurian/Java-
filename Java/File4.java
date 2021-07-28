package com.ust.example;

import java.io.File;
public class File4 {
	
	public static void main(String[] args) {
		File file = new File("D:fileExample.txt");
		try {
			file.createNewFile();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		File newFile = new File("D:newExample.txt");
		boolean value = file.renameTo(newFile);
		if(value ) {
			System.out.println("The name of the file is changed");
			
		} else {
			System.out.println("the name cannot be changed");
		}
	}

}
