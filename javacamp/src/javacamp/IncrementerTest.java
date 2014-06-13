package javacamp;

public class IncrementerTest {

	public static void main(String[] args) {

		int a = 10;

		System.out.println(a++);

		int b = 10;

		System.out.println(++b);
		
		int c = 10;
		
		int d = b + c++ ;
		
		System.out.println(d);
		
		int e = d + ++c;
		
		System.out.println(e);

	}

}
