package assignments;

//Program to create class Calculator to perform addition, subtraction, multiplication and division using methods

public class Calculator {
	
	public int addition(){
		int number1 = 20, number2 = 80, number3 = 60, sum;
		sum = number1 + number2 + number3;
		return sum;
		}
	
	public int subtraction() {
		int number1 = 50, number2 = 30, difference;
		difference = number1 - number2;
		return difference;
	}
	
	public double multiplication() {
		double number1 = 34.67, number2 = 23.5, product;
		product = number1 * number2;
		return product;
		}
	
	public float division() {
		float number1 = 56, number2 = 3, quotient;
		quotient = number1 / number2;
		return quotient;
	}
	
	public static void main(String[] args) {
		/*Calculator calcObj = new Calculator();
		int result = calcObj.addition();
		System.out.println("The result of addition is: " +result);
		
		*/
	}	
	
}



