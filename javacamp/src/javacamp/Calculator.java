package javacamp;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Starting the program");
		int a = 4;
		System.out.println("a has " + a);
		int b = 7;
		System.out.println("b has " + b);

		// Call the add method
		System.out.println("Calling add");
		int c = add(a, b);
		System.out.println("c has " + c);
		// Call the subtract method
		c = subtract(a, b);
		System.out.println("c has" + c);

		// Sequence of elements
		int[] aArray = { 1, -2, 2, 3, -4, 1, -2, 4, 1, 2 };
		int[] bArray = new int[10];

		bArray[0] = 1;
		bArray[1] = -2;

		int k = bArray[0] + bArray[1];

		System.out.println("Sum of array " + k);

		int value = addAll(aArray);
		System.out.println("Sum of all positive value " + value);

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
