/*
 Create a method int sum(int[] values, int start,
int end) that throws an IllegalArgumentException
when passed an array of length 0, a NullPointerException
when passed a null, and
ArrayIndexOutOfBoundsException when start and
end do not fall within the range of the given array. It should return
the sum of the values in the array from start to end but must
throw Exception when sum is 0. */


import java.util.Scanner;
class ArraySum {
	
	int sum(int[] values, int start,int end)
	{
		int sum = 0; 
		try 
		{
			for(int a = start;a<end;a++) 			{
				sum += values[a];			}

			if(start==end) 
				throw new IllegalArgumentException();

			if(values==null) 
				throw new NullPointerException();

			if(start<0 || end>=values.length || start>end)
				throw new ArrayIndexOutOfBoundsException();

			if(sum==0) 
				throw new Exception();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(NullPointerException a)
		{
			System.out.println("NullPointerException");
		}
		catch(Exception e) 
		{
			System.out.println("sum is 0");
		}

		return sum;
	}

	public static void main(String[] args) { 

		ArraySum sa = new ArraySum();
		Scanner sc = new Scanner(System.in);
		int start,end,size;

		System.out.println("Enter Size of array you want : ");
		size = sc.nextInt();
		int arr[] =new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter value of ["+i+"] index you want");
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter Start index of array you want : ");
		start = sc.nextInt();

		System.out.println("Enter End index of array you want : ");
		end = sc.nextInt();

		System.out.println("Sum of array elements you enterd is is : "+sa.sum(arr, start, end));
		sc.close();
	}
}
