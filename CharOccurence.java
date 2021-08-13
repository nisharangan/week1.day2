package assignments;

public class CharOccurence {
	
	public static void main(String[] args) {
		
		String name = "welcome to chennai";
		char[] charArray = new char[name.length()];
		charArray = name.toCharArray();
		char singleChar = 'e';
		int count = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			 if(singleChar == charArray[i]) {
				 count = count+1;
				 
			 }
		}
		
		System.out.println("No. of times the character '" +singleChar +"' occured: " +count );
		
	}

}
