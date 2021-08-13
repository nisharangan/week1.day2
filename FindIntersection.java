package assignments;

public class FindIntersection {

	/*
	 * Declare an arrayOne and arrayTwo 
	 * Iterate arrayOne and arrayTwo using nested for loops 
	 * Check the condition, first value in arrayOne with all other values in arrayTwo 
	 * Like wise for all elements. If any values matches store the value in another arrResult and increment the counter
	 * Using for loop, print the arrResult
	 */
	public static void main(String[] args) {

		int[] arrOne = { 8, 6, 9, 4, 2, 7 };
		int[] arrTwo = { 1, 6, 5, 9, 3, 7 };
		int[] arrResult = new int[arrOne.length];
		int count = 0;

		for (int i = 0; i < arrOne.length; i++) {

			for (int j = 0; j < arrTwo.length; j++) {

				if (arrOne[i] == arrTwo[j]) {
				
					arrResult[count] = arrOne[i];
					count = count + 1;
					break;
				}

			}

		}

		System.out.println("The Intersection values are:");
		for (int i = 0; i < arrResult.length; i++) {
			
		/*The following IF condition is used to ignore value 0 in array and to print the numbers alone
		 * Ignoring the IF statement the program prints 6,9,7,0,0,0 - because by default 0 is assigned for array - check
		 * As array size is a[6]
		 */
			if ((arrResult[i] > 1) && (arrResult[i] != 0))
			System.out.println(arrResult[i]);

		}
	}

}
