package javacamp;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {

		System.out.println("Starting the calculator");
		Scanner s = new Scanner(System.in);
		int a=0;
		int b=0;
		
		while (s.hasNext()) {
			String str = s.nextLine();				
			a = Integer.parseInt(str);
			break;
		}
		
		while (s.hasNext()) {
			String str = s.nextLine();				
			b = Integer.parseInt(str);
			break;
		}

		// Call the add method
		System.out.println("Calling add");
		int c = add(a, b);
		System.out.println(c);

	}

	// Adds to Numbers
	public static int add(int x, int y) {
		System.out.println("Inside add method");
		int c = x + y;
		return c;
	}

	// Adds to Numbers
	public static int subtract(int a, int b) {
		System.out.println("Inside substract method");
		int c = a - b;
		return c;
	}

	public static int multiply(int a, int b) {
		int c = a * b;
		return c;
	}

	public static int divide(int a, int b) {
		int c = a / b;
		return c;
	}

	// Add all positive numbers in the array and return the value
	public static int addAll(int[] aArray) {
		int positveElementsSUm = 0;
		for (int i = 0; i < aArray.length; i++) {

			if (aArray[i] > 0) {
				positveElementsSUm = positveElementsSUm + aArray[i];
			} else {
				System.out.println("Negative number");
			}

		}
		return positveElementsSUm;
	}

	// Add all even numbers in the array and return the value
	public static int addAllEven(int[] aArray) {
		int positveElementsSUm = 0;
		for (int i = 0; i < aArray.length; i++) {

			if (aArray[i] > 0) {
				positveElementsSUm = positveElementsSUm + aArray[i];
			} else {
				System.out.println("Negative number");
			}

		}
		return positveElementsSUm;
	}

}
