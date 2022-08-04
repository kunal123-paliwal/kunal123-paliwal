
public class CountCharacters {

	public static void main(String[] args) {
			      
		  String str = "MY NAME IS KUNAL PALIWAL";    
          int count = 0;    
          System.out.println("The entered string is: "+str);    
	       for(int i = 0; i < str.length(); i++) 
		        {    
		            if(str.charAt(i) != ' ')    
		                count++;    
		        }             
		  System.out.println("Total number of characters in the string: " + count); 

	}

}
