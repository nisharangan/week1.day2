package assignments;

public class Palindrome {

	//Program to find whether the given string is Palindrome or not
	
	/*public static void main(String[] args) {
		String strName = "madam", revStr = "";
		int strLength = strName.length();
		
		for(int i=strLength-1; i>=0; i--) {	
			revStr = revStr + strName.charAt(i);	
		}	
		if(strName.equals(revStr))
			System.out.println("The given string is a Palindrome");
		else
			System.out.println("The given  string is not a Palindrome");		
	} */
	
	public static void main(String[] args) {
		String strName = "malayalam";
		char[] revChar = new char[strName.length()];
		char[] charArray = new char[strName.length()];
		
		charArray = strName.toCharArray();
		int charLength = charArray.length - 1;
		int count = 0;
		
		for (int i = 0; i <= charLength; i++) {

			for (int j = charLength - i; j >= 0;) {
				revChar[i] = charArray[j];
				//System.out.print(revChar[i]);
                break;
			}

		}
		
		for (int i = 0; i < charArray.length; i++) {
				
			if ((charArray[i]) == (revChar[i])) {
				count = count + 1;
				
			} else {
				System.out.println("The given string is not a palindrome");
				break;

			}		
		}
		if(count>1)
			System.out.println("The given string is a Palindrome");				
	}	
}
		
		
	
