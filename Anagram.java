package week1.day2.classroom.arrays;

import java.util.Arrays;

import java.util.Iterator;

public class Anagram {

	public static void main(String[] args) {
		// Declaration of String
		String text1 = "stops";
		String text2 = "potss";
		// check both strings are equal
		if (text1.equals(text2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		// Convert string to charArray
		char[] charArray = text1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("Data at [" + i + "]=" + charArray[i]);
		}
		// sort array
		Arrays.sort(charArray);

		for (int j = 0; j < charArray.length; j++) {
			System.out.println("Sorted array " + charArray[j]);
		}

		System.out.println("#######################################");
        //convert second string to charArray
		char[] charArray2 = text2.toCharArray();
		for (int i = 0; i < charArray2.length; i++) {
			System.out.println("Data at [" + i + "]=" + charArray2[i]);
		}
		// sort second Array
		Arrays.sort(charArray2);

		for (int j = 0; j < charArray2.length; j++) {
			System.out.println("Sorted array " + charArray2[j]);
		}
		if (charArray.length == charArray2.length) {
			System.out.println("Both the arrays has same value");
		}

	}

}
