//2.Write a program to count number of char in a string entered by user excluding space.

package Loop;

//declaring import java.util for accessing scanner to take input from user. 
import java.util.*;

// declaring class
public class CountCharacter
{
	// main driver method
	public static void main(String[] args)
	{
	
	Scanner sc= new Scanner(System.in);
	
	//asking user to enter string
	System.out.println("enter string");
	
	//assigning user entered string in string variable
	String string = sc.nextLine();
	            // declaring variable count of type integer
		        int count = 0;    
		            
		        // staring for loop for counting number of character in string without space
		        for(int i = 0; i < string.length(); i++)
		        {    
		            if(string.charAt(i) != ' ')    
		                count++;    
		        }    
		            
		        // output after calculating number of character
		        System.out.println("Total number of characters in a string excluding space " + count);    
   }    
		
}

