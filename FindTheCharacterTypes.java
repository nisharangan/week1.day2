package assignments;

public class FindTheCharacterTypes {
	
	public static void main(String[] args) {
		
		String strName = "$$ Welcome to 2nd Class of Automation $$";
		
		 int  letter = 0, space = 0, digit = 0, specialChar = 0;
		 
		 char[] charArray = new char[strName.length()];
		 charArray = strName.toCharArray();
		 for (int i = 0; i < charArray.length; i++) {
			 
			 if (Character.isDigit(charArray[i])){
				 
				 digit = digit + 1;	 
				
			} else if(Character.isLetter(charArray[i])) {
				
				letter = letter + 1;
				
			} else if(Character.isSpaceChar(charArray[i])) {
				
				space = space + 1;
			
			} else
				specialChar += 1;	
			}		
		 
		 System.out.println("Total Number of Letters: " +letter);
		 System.out.println("Total Number of Digits: " +digit);
		 System.out.println("Total Number of Special Characters: " +specialChar);
		 System.out.println("Total Number of Spaces: " +space);

	}

}
