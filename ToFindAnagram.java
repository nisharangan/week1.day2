package assignments;

import java.util.Arrays;

public class ToFindAnagram {

	/*
	 * Pseudocode: Declare two strings and assign values. Convert both strings into
	 * char array. Sort the two char arrays. Iterate using for loop and check for
	 * the condition. Condition as whether the first element in both the char array
	 * are equal. If condition is true continue till end of the loop and then print
	 * the given string is anagram. If false come out of the loop and print the
	 * given string is not an anagram.
	 */

	public static void main(String[] args) {
		String strOne = "elbow";
		String strTwo = "below";
		int count = 0;

		char[] charArrOne = new char[strOne.length()];
		char[] charArrTwo = new char[strTwo.length()];
		charArrOne = strOne.toCharArray();
		charArrTwo = strTwo.toCharArray();
		Arrays.sort(charArrOne);
		Arrays.sort(charArrTwo);

		if (charArrOne.length == charArrTwo.length) {

			for (int i = 0; i < charArrOne.length; i++) {

				if (charArrOne[i] == charArrTwo[i]) {
					count = count + 1;
				} else {

					System.out.println("The given string is not an Anagram");
					break;
				}
			}
			if (count == charArrOne.length)
				System.out.println("The given string is an Anagram");
		}

		else
			System.out.println("The given string is not an Anagram");

	}

}
