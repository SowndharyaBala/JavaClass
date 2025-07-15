package com.file;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) {
		
		try {
			FileWriter w = new FileWriter("Example.txt" , true);
			w.write("Welcome to JAva");
			w.append("File handling is important.");	
			w.append("Practice makes perfect.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		FileReader reader = new FileReader("Example.txt");
//		
//		char[] buffer = new char[10];
//		reader.read(buffer);
//		
//		System.out.println("First 10 char " + new String(buffer));
//		reader.close();
	}
}