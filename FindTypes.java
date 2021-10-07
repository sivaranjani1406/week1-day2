package week1.day2.classroom.arrays;

public class FindTypes {

	public static void main(String[] args) {

		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		char[] charArray = test.toCharArray();
		int letter = 0, space = 0, num = 0, specialChar = 0;

		for (int i = 0; i < charArray.length; i++)

		{
			if ((charArray[i] >= 'A' && charArray[i] <= 'Z') || (charArray[i] >= 'a' && charArray[i] <= 'z')) {
				letter++;
			} else if (charArray[i] == ' ') {
				space++;
			}

			else if (charArray[i] >= '0' && charArray[i] <= '9') {
				num++;
			} else {
				specialChar++;
			}
		}

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
