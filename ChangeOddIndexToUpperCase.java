package assignments;

public class ChangeOddIndexToUpperCase {

	/* Pseudocode 
	 * Declare a String with values Convert the given string into a Char
	 * array Iterate the Char array using for loop and check the condition The
	 * condition is, if the index value is Odd change the particular element into
	 * Upper case If index value is even do not do any changes Print the updated
	 * char array;
	 */

	public static void main(String[] args) {

		String strName = "welcome";
		char[] charArrName = new char[strName.length()];
		charArrName = strName.toCharArray();
		for (int i = 0; i < charArrName.length; i++) {
			
			if (i % 2 == 1) {
				charArrName[i] = Character.toUpperCase(charArrName[i]);
				System.out.print(" " +charArrName[i]);

			}
			else
				System.out.print(" " +charArrName[i]);

		}

	}

}
