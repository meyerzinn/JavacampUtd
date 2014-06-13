package javacamp;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCopyTest {

	public static void main(String[] args) {

		// This is small array
		int[] smallArray = new int[5];

		smallArray[0] = 1;
		smallArray[1] = 3;
		smallArray[2] = 4;
		smallArray[3] = 5;
		smallArray[4] = 6;

		System.out.println(Arrays.toString(smallArray));

		// Create a big array

		int[] bigArray = new int[10];

		// Copy all corresponding elements to the big array
		for (int i = 0; i < smallArray.length; i++) {
			bigArray[i] = smallArray[i];
		}

		System.out.println(Arrays.toString(bigArray));

		System.out.println("-------------- Array List------------");

		// A dynamic collection which acts like a variable array
		ArrayList<Integer> arrayList = new ArrayList();

		// We can use this class to add numbers, delete numbers, increase its
		// size etc
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);

		// Special for loop we discussed yesterday... can go through all the
		// element in the arraylist

		for (int number : arrayList) {
			System.out.print(number + " ");
		}

		System.out.println();

		// Cool thing about it is... we edit, delete the list
		// Remove element at index 2
		arrayList.remove(2);

		for (int number : arrayList) {
			System.out.print(number + " ");
		}

		System.out.println();

		// Change the element at index 2
		arrayList.set(2, 19);

		for (int number : arrayList) {
			System.out.print(number + " ");
		}

		System.out.println();
		// We can add all elements from one list to other easily

		ArrayList<Integer> anotherList = new ArrayList();

		arrayList.add(199);
		arrayList.add(399);
		arrayList.add(499);
		arrayList.add(995);
		arrayList.add(633);

		arrayList.addAll(anotherList);
		
		for (int number : arrayList) {
			System.out.print(number + " ");
		}
		

		System.out.println();
		//ArrayList of Strings
		
		ArrayList<String> stringList = new ArrayList();
		
		stringList.add("Hello");
		stringList.add("Lists");
		stringList.add("are");
		stringList.add("cool");
		stringList.add("use");
		stringList.add("them");
		stringList.add("in");
		stringList.add("apps");
		
		for (String str : stringList) {
			System.out.print(str + " ");
		}
		

	}

}
