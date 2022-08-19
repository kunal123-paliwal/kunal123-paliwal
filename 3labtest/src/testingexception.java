import java.util.Scanner;

public class testingexception {
		void divException(String n1,String n2)
	{	
		int r; 

		try {
			r = Integer.parseInt(n1)/Integer.parseInt(n2);
			System.out.println("Average is : "+r);
		}
		catch(ArithmeticException e)		{
			System.out.println("Invalid division");                                           
		}
		catch(NumberFormatException  e) {
			System.out.println("Format mismatch");
		}
		catch(Exception e)
		{
			System.out.println("Exception encountered");	
		}
		finally{
			System.out.println("Exception Handling Is Completed");
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("enter two values you want  : ");
		String n1=sc.next();
		String	n2=sc.next();

		testingexception obj = new testingexception();
		obj.divException(n1,n2);

		sc.close();
	}

}
