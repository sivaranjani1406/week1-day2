package week1.day2.classroom.arrays;

public class Palindrome {

	public static void main(String[] args) {
		
		String text = "madam";
		String rev ="";
		char[] charArray = text.toCharArray();
		char[] charArray1=rev.toCharArray();
		int length = charArray.length;
		
		for(int i=length-1;i>=0;i--)
		
			rev= rev+charArray[i];
			
			if(text.equalsIgnoreCase(rev))
			{
				System.out.println(" String is palindrome");
			}
			
			else
			{
				System.out.println("String is not palindrome");
			}
		
		

	}

}
