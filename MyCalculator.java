package assignments;

//Program to create a class MyCalculator and call methods from the class Calculator and print the results

public class MyCalculator {
	
	public static void main(String[] args) {
		Calculator myCalcObj = new Calculator();
		int sum = myCalcObj.addition();
		System.out.println("The result of addition is: " +sum);
		
		int difference = myCalcObj.subtraction();
		System.out.println("The result of subtraction is: " +difference);
		
		double product = myCalcObj.multiplication();
		System.out.println("The result of multiplication is: " +product);
		
		float quotient = myCalcObj.division();
		System.out.println("The result of division is:" +quotient);
	}

}
