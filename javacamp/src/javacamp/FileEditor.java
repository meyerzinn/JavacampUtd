package javacamp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEditor {

	public static void main(String[] args) {		
		File myFile = new File("K:\\sample.txt");
		System.out.println("File Name is '" + myFile.getName() + "'");
		System.out.println("File length is '" + myFile.length() + "'");
		System.out.println("File path is '" + myFile.getPath() + "'");				
		try {
			FileWriter writer = new FileWriter(myFile,true);					
			writer.append("This is next line");		
			writer.append("\n");
			
			
			writer.append("This is next next next line");		
			writer.append("\n");
			
			writer.flush();
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
