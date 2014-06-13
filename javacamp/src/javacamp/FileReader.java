package javacamp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {

		File myFile = new File("K:\\sample.txt");

		System.out.println("File Name is '" + myFile.getName() + "'");

		System.out.println("File length is '" + myFile.length() + "'");

		System.out.println("File path is '" + myFile.getPath() + "'");

		Date date = new Date(myFile.lastModified());

		System.out.println("File Date is '" + date + "'");

		System.out.println("File contents below \n");
		try {
			Scanner scanner = new Scanner(myFile);
			
			while (scanner.hasNext()) {				
				String str = scanner.nextLine();
				System.out.println(str);				
			}			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}
