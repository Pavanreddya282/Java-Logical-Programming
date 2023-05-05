
package com.JavaPractice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("Sample.txt");
			writer.write("This is a sample file created using Java FileWriter.");
			writer.close();
	        System.out.println("File has been created and written successfully!");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
