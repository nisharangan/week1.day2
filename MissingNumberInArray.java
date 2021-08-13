package assignments;

import java.util.Arrays;

public class MissingNumberInArray {

	/*Sort the array
	 *Iterate the array in loop to add all the number in an array
	 *Iterate the array in another loop to subtract the sum in a sequence numbers
	 * Prints the negative result instead Print absolute value 
	 */
	 
	public static void main(String[] args) {

		int[] arrName = { 1, 2, 6, 4, 7, 5, 8 };
		int sumOfArray = 0;
        Arrays.sort(arrName);
        
        
		for (int i = 0; i < arrName.length; i++) {
			sumOfArray = sumOfArray + arrName[i];
         }
		
		int firstElement = arrName[0];
		for (int j = 0; j <=arrName.length; j++) {
			sumOfArray = sumOfArray - (j + firstElement);			
	}   
		int result = Math.abs(sumOfArray);
		System.out.println("The missing number in an array is:" +result);
		
		
	}

}
