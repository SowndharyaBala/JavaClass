package com.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
	
		//create
		try {
			File file = new File("Sample.txt");
			if(file.createNewFile()) {
				System.out.println("File created " + file.getName());
			}else {
				System.out.println("File already exists");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//write
//		try {
//			FileWriter writer = new FileWriter("Sample.txt");
//			writer.write("Hello World");
//			writer.write("Welcome to File handling");
//			writer.close();
//			System.out.println("Successfully written to file");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		//read
	char [] array = new char[100];
	try {
		FileReader input = new FileReader("Sample.txt");
		System.out.println(input.ready());
		
		input.read(array);
		System.out.println(array);
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}
