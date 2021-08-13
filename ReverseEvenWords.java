package assignments;

	/*Pseudocode
	 * Declare a string with a sentence.
	 * Divide the sentence into words using split()
	 * Use the If statement to check whether the given index number is even 
	 * All even words are in odd Index
	 * 
	 * 
	 * 
	 * 
	 */

	public class ReverseEvenWords {
		public static void main(String[] args) {
			String strName = "Hi Welcome to Java Program ";
			String[] splitStr = strName.split(" ");
			char[] charArr = new char[strName.length()];
			char[] revChar = new char[strName.length()];
		     int splitStrLength = splitStr.length;
			
			for (int i = 0; i < strName.length(); i++) {
				
				if (i % 2 == 1) {
					charArr = splitStr[i].toCharArray();
					int arrLength = charArr.length - 1;
					
					for (int j = 0; j <= arrLength; j++) {

						for (int k = arrLength - j; k >= 0;) {
						revChar[j] = charArr[k];
						System.out.print("" +revChar[j] + "");
		                break;
						}
                    
					}
					//charArr =  null; 
				}
				else {
				System.out.print(" "+splitStr[i] + " ");
				continue;
				}
			 if (i>=splitStrLength)
				 break;
				
			
			}
				
      
		}

	}

