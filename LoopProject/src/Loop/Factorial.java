//1. Write a method th find factorial of a number input by user.factorial(int n).
//call this methos from main() and pass argument n
//Repeat this untill user enters no.

package Loop;

// Declaring import java.util for accessing scanner to take input from user. 
import java.util.*;

// declaring class
public class Factorial
{
     // main driver method
	public static void main(String[] args)
	{
		String yes_no;
		
		Scanner sc= new Scanner(System.in);
		// starting do while loop
		do {
			
			// declaring variable i and factorial
         int i;         
         long factorial=1;
         
                 // asking user to enter number for factorial        
                 System.out.println("ENTER NUMBER FOR FACTORIAL");
                 
                 // reading number from user
                 int number=sc.nextInt();
		         
                 // finding factorial
		              for(i=1;i<=number;i++)
		              {
	                      	factorial=factorial*i;
	                  }
		// displaying factorial
	     System.out.println("Factorial of "+number+" is: "+factorial);
	
	    //asking user he/she want to continue or not 
	     System.out.println("do you want to continue yes or no");
	     
	     //reading user input yes or no
	     yes_no = sc.next();
	
        }
		//checking user answer if it is yes then again it will repeat and if no it will not repeat
		while(yes_no.equals("yes"));
    }
}