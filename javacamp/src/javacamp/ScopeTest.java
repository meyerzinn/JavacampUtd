package javacamp;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int a = 10;
					
			{
				a = 10000;
			}
		}	

		// System.out.println(a);
	}

	public void method1() {
		int a = 10;
	}

	public void method2() {
		int b = 10;
		int a = b + 10;
	}

}
