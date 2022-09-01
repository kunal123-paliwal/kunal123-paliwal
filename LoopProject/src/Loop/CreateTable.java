//3.Write a program to print table of any number input by user.


package Loop;

//declaring import java.util for accessing scanner to take input from user. 
import java.util.*;

// declaring class
public class CreateTable
{
	// main driver method
	public static void main(String[] args)
       {
		
		Scanner sc= new Scanner(System.in);
		
		// asking user to enter number of which he want the table
		System.out.println("ENTER NUMBER FOR TABLE");
		
		// reading user input in variable number
		int number=sc.nextInt();
		
		//asking user how many time he want to multiply the number
		System.out.println("Enter number till which you want the table of "+number);
		
		// reading user input in variable multiple
		int multiple=sc.nextInt();
		
		// starting of while loop
		for(long i=1;i<=multiple;i++) 
		      
		      {
			//showing input in form of table
		       System.out.println(number+" * "+i+" = "+number*i);
	          }
	   }

}
