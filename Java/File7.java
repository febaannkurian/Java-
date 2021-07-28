package com.ust.example;

import java.io.IOException;
import java.io.StringReader;
public class File7 {
	
	public static void main(String[] args) {
		String str = "This is a stringreader program";
		StringReader sr = new StringReader(str);
		int i = 0;
		try {
			while((i = sr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
