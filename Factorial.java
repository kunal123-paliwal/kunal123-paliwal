//Write a program to find factorial of a number.


package exception;

import java.util.*;

class Factorial
{  
	 public static void main(String args[])
	 {  
		 //reading number for factorial from user
		 
		 Scanner sc= new Scanner(System.in);
		 System.out.println(" enter the number for getting the factorial");
		 int number = sc.nextInt();
	     int i,fact=1;
	     
	    //calculating factorial of a number entered by a user using for loop
	     for(i=1;i<=number;i++)
	     {    
	      fact=fact*i;    
	     }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
}  