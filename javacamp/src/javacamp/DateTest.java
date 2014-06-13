package javacamp;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Number of milliseconds from January 1, 1970, 00:00:00 GMT
		System.out.println(System.currentTimeMillis());

		Date yesterday = new Date(System.currentTimeMillis() - 86400000);
		System.out.println("Date yesterday " + yesterday);

		Date today = new Date(System.currentTimeMillis());
		System.out.println("Date today " + today);
	}

}
