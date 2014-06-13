package javacamp;

public class ParameterPassingTest {

	public static void main(String[] args) {

		int a = 1;
		System.out.println("Before method:" + a);
		method(a);
		System.out.println("after method:" + a);

		User user = new User();
		user.age = 1;
		System.out.println("User - Before method:" + user.age);
		method(user);
		System.out.println("User - after method:" + user.age);

	}

	public static void method(int a) {
		a = a + 10;
		System.out.println("Inside method:" + a);
	}

	public static void method(User user) {
		user.age = user.age + 10;
		System.out.println("User - Inside method:" + user.age);
	}

}
