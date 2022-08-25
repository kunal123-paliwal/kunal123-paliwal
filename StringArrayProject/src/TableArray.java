import java.util.Arrays;
public class TableArray {

	public static void main(String[] args) {
		String[] strArray = {"Peter","Amy","John","Boyd","Cathy"};
		int[] intArray = {15,9,14,10,12};
	
		
		
		Arrays.sort(strArray);  


		System.out.println(Arrays.toString(strArray));
	
	
		Arrays.sort(intArray);
		
		System.out.println(Arrays.toString(intArray));
		
  
  System.out.println();
  }
}