package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class File_Handling {

	public static void main(String[] args) {
		
//		File obj = new File("myfile.txt");
//		System.out.println("File Created");
		
		try {
			File obj = new File("Myfile.txt");
			if(obj.createNewFile()) {
				System.out.println("File created : " + obj.getName());
			}else {
				System.out.println("File exist already");
			}
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("Myfile.txt");
			writer.write ("Files in java are reall good");
			writer.close();
			
			System.out.println("Successfully written");
		}catch(IOException e) {
			System.out.println("An error");
			e.printStackTrace();
		}
		
		try {
			File obj = new File("MyFile.txt");
			Scanner reader = new Scanner(obj);
			
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			
			reader.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error");
			e.printStackTrace();
		}
		
		
//		File obj = new File("Myfile.txt");
//		
//		if(obj.delete()) {
//			System.out.println("Deleted file : " + obj.getName());
//		}else {
//			System.out.println(obj.getAbsolutePath());
//			System.out.println("file deleted successfully");
//		}


	}

}
