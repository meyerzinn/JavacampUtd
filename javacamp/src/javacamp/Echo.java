package javacamp;

import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		while (s.hasNext()) {
			String str = s.nextLine();		
			
			if(str.equals("Good bye")){				
				System.out.println("Ok..bye..take care");
				System.out.println("Program stopped");
				System.exit(0);
			}
			
			//System.out.println("Input "+str);			
			System.out.println("Ouput "+str.toUpperCase());
		}

	}

}
