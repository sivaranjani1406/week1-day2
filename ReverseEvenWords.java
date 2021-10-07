package week1.day2.classroom.arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String str="I am a software tester";
		String[] word =str.split(" ");
		for(int i=0;i<word.length;i++) {
			if(i%2==1) {
		     char ch[] = word[i].toCharArray();
		     for(int j=ch.length-1;j>=0;j--) {
		    	 System.out.print(ch[j]);
		     }
			System.out.print(" ");
			}
			else
			{
				System.out.print(word[i] + " ");
			}
		}
		

	}

}
