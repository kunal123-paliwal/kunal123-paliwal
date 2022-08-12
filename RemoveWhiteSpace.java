//Write a Java Program to remove all the white spaces from a string.


package exception;

import java.util.*;

public class RemoveWhiteSpace
{    
    public static void main(String[] args)
    { 

    	//reading string from user
    	Scanner sc= new Scanner(System.in);
		 System.out.println(" enter the string for removing white space");
		 String str = sc.nextLine();
          
        //Removes the white spaces     
        str = str.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + str);    
    }    
}    