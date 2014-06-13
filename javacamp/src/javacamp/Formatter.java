package javacamp;

public class Formatter {

	public static void main(String[] args) {
					
		float decimal = 1.5f;
		
		double bigDecimal = 1.55555555555555555555;
				
		System.out.format("%2.9f", decimal);
		
		System.out.println();
		
		System.out.format("%1.3f", bigDecimal);
				
	}

}
