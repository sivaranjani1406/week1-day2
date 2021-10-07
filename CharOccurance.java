package week1.day2.classroom.arrays;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'e') {

				count++;
			}
		}
		System.out.println("Number of Occurences of character e: " + count);

	}

}
