package assignments;

import java.util.Arrays;

public class FindSecondLargestInArray {
	
	public static void main(String[] args) {
		int[] arrNum = {3, 2, 11, 4, 6, 7};
		Arrays.sort(arrNum);
	    System.out.println("The second largest number in an array is: " +arrNum[arrNum.length-2]);
			
	}

}
