
/*
 Create a method named countVowels that take a String as input and convert it into  an array of
characters  and returns the number of vowels in the array.
Furthermore, the method should throw a checked exception if the
array contains the letter 'x'.
 */

import java.util.Scanner;
public class Vowels {
	int countVowels(String str) {

		int count=0; 
		str=str.toLowerCase();
		char newstr[] = str.toCharArray();
		for(int i=0;i<newstr.length;i++)
		{
			if( (newstr[i]=='a') || (newstr[i]=='e') || (newstr[i]=='i') || (newstr[i]=='o') ||  (newstr[i]=='u')   )
				count++;
			if(newstr[i]=='x') {
				try {
					throw new Exception();
				}
				catch(Exception e) {
					System.out.println("YOUR STRING CONTAIN LETTER X WHICH IS EXCEPTION");
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Vowels cv = new Vowels();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sring : ");
		String str=s.next();

		int result = cv.countVowels(str);
		System.out.println("Total Number of Vowels presents : "+result);

		s.close();
	}
}
