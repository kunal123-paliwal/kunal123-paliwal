
public class average {

	public static void main(String[] args) {
		int[] number= new int[] {20, 30, 25, 35, -16, 65, -120};              
		
		// calculate sum of all array element
		int sum=0;
		for (int i=0; i<number.length; i++)
			sum = sum+ number[i];
		
		// calculate average value of array element
		double average =sum/number.length;
		System.out.println(" AVERAGE VALUE OF ARRAY ELEMENT IS : " + average);

	}

}
