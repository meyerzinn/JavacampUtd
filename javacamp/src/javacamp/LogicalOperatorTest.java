package javacamp;

public class LogicalOperatorTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 8;

		if (a % 2 == 0 && b % 2 == 0) {
			System.out.println("Both numbers are even");
		} else {
			System.out.println("Alleast one of them is not even");
		}

		if (a % 2 == 0 || b % 2 == 0 || (a + b) > 20) {
			System.out
					.println("Alleast one of them is even or their sum is greater than 20");
		} else {
			System.out.println("Both of them are not even");
		}
	}
}
