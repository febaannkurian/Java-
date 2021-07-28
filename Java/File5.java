package com.ust.example;

import java.io.File;

public class File5 {
	
	public static void main(String[] args) {
		File file = new File("D:");
		String[] fileList = file.list();
		for(String str : fileList) {
			System.out.println(str);
		}
	}

}
